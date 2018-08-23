package task8;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.RandomAccessFile;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class Ex13 extends Application {
    @Override
    public void start(Stage primaryStage) throws Exception {

        FileCombinerPane pane = new FileCombinerPane();

        primaryStage.setScene(new Scene(pane));
        primaryStage.setTitle("");
        primaryStage.show();

    }
    private class FileCombinerPane extends BorderPane {
    //  /Users/Nurlybek/Documents/NetBeansProjects/JavaApp1/src/task8/1.txt
        TextField file;
        TextField num;
        Button btn;

        FileCombinerPane() {
            file = new TextField();
            num = new TextField();
            btn = new Button("Combine Files");
            btn.setOnAction(e -> combineFiles());

            Label lbl1 = new Label(
                            "If the base file is named temp.txt with 3 peices,\n" +
                            "temp.txt.1, temp.txt.2, temp.txt.3 are combined into temp.txt\n" +
                            "Enter absolute path if file is not in working directory...");
            Label lbl2 = new Label("Base Filename:");
            Label lbl3 = new Label("Number Of Files:");

            GridPane gridPane = new GridPane();
            gridPane.add(lbl1, 0, 0, 2, 1);
            gridPane.addRow(1, lbl2, file);
            gridPane.addRow(2, lbl3, num);
            gridPane.setHgap(10);
            gridPane.setVgap(10);
            gridPane.setPadding(new Insets(20));
            GridPane.setFillWidth(num, false);
            num.setPrefColumnCount(4);

            setCenter(gridPane);
            setBottom(btn);

            setAlignment(btn, Pos.CENTER);
            setPadding(new Insets(10));
        }
        public void combineFiles() {
            File[] splitFiles = new File[Integer.parseInt(num.getText())];
            File targetFile = new File(file.getText());
            for (int i = 0; i < splitFiles.length; i++) {
                splitFiles[i] = new File(targetFile.getAbsolutePath() + "." + (i + 1) );
                if (!splitFiles[i].isFile()) {
                    System.out.println(splitFiles[i].getAbsolutePath() + " file not found.");
                }
            }
            try (BufferedOutputStream out = new BufferedOutputStream(new FileOutputStream(targetFile))) {
                int buffer;
                for (File f : splitFiles) {
                    try (BufferedInputStream in = new BufferedInputStream(new FileInputStream(f))) {
                        while ((buffer = in.read()) != -1)
                            out.write(buffer);
                    }
                }
            }
            catch (IOException ex) {
                System.out.println("Error combining files");
            }
        }
    }
    public static void main(String[] args) {
        Application.launch(args);
    }
}
