package task10;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.TextArea;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;
public class Task1 extends Application {
    @Override
    public synchronized  void start(Stage primaryStage) {
        StackPane pane = new StackPane();
        TextArea txt = new TextArea();
        Thread t1 = new Thread(new PrintChars('a', txt, 50));
        Thread t2 = new Thread(new PrintChars('b', txt, 50));
        Thread t3 = new Thread(new PrintNums(100, txt));
        t1.start();
        t2.start();
        t3.start();
        pane.getChildren().add(txt);
        
        Scene scene = new Scene(pane, 300, 250);
        primaryStage.setTitle("Task 1");
        primaryStage.setScene(scene);
        primaryStage.show();}
public static void main(String[] args){launch(args);}}
