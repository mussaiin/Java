package lab2;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class DecHexBin extends Application {
    
    @Override
    public void start(Stage primaryStage) {
        GridPane root = new GridPane();
        Label l1 = new Label("Decimal");
        Label l2 = new Label("Hexadecimal");
        Label l3 = new Label("Binary");
        
        TextField tf1 = new TextField();
        TextField tf2 = new TextField();
        TextField tf3 = new TextField();
        
        root.setAlignment(Pos.CENTER);
        root.setPadding(new Insets(10));
        root.setHgap(10);
        root.setVgap(5);
        
        root.add(l1, 0, 0);
        root.add(l2, 0, 1);
        root.add(l3, 0, 2);
        root.add(tf1, 1, 0);
        root.add(tf2, 1, 1);
        root.add(tf3, 1, 2);
        tf1.setOnAction(e -> {
            String s = tf1.getText();
            if(!s.equals("") || s!=null){
                tf2.setText(Integer.toHexString(Integer.parseInt(tf1.getText())));
                tf3.setText(Integer.toBinaryString(Integer.parseInt(tf1.getText())));
                
            }
        });
        /*tf2.setOnAction(e -> {
            String s = tf2.getText();
            if(!s.equals("") || s!=null){
                tf1.setText(Integer.parseInt(Integer.toHexString(tf2.getText()), 16));
                tf3.setText(Integer.toBinaryString(Integer.toHexString(tf2.getText())));
            }
        });
        
        tf3.setOnAction(e -> {
            String s = tf3.getText();
            if(!s.equals("") || s!=null){
                tf1.setText(Integer.toHexString(Integer.parseInt(tf3.getText())));
                tf3.setText(Integer.toBinaryString(Integer.parseInt(tf3.getText())));
                
            }
        });*/

        Scene scene = new Scene(root, 300, 250);
        
        primaryStage.setTitle("Converter");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
    
}
