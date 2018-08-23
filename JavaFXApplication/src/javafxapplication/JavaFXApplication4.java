/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javafxapplication;

import javafx.application.Application;
import static javafx.application.Application.launch;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.layout.FlowPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.StackPane;
import javafx.scene.text.Font;
import javafx.stage.Stage;
import sun.font.TextLabel;

/**
 *
 * @author Nurlybek
 */
public class JavaFXApplication4 extends Application {
    
    @Override
    public void start(Stage primaryStage) {
    GridPane root = new GridPane();
    root.setAlignment(Pos.CENTER);
    root.setPadding(new Insets(50));
    root.setHgap(10);
    root.setVgap(10);
    Label txt = new Label("WELCOME");
    txt.setFont(Font.font(40));
    
    root.add(txt, 0, 0, 2, 1);
    root.add(new Label("Login:"), 0, 1);
    root.add(new TextField("username"), 1, 1);
    root.add(new Label("Password:"), 0, 2);
    root.add(new PasswordField(), 1, 2);
    root.add(new Button("Sign in"), 1, 3);
        
    Scene scene = new Scene(root, 300, 250);
        
        primaryStage.setTitle("Hello World!");
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
