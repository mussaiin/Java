/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javafxapplication;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.layout.FlowPane;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;
import sun.font.TextLabel;

/**
 *
 * @author Nurlybek
 */
public class JavaFXApplication3 extends Application {
    
    @Override
    public void start(Stage primaryStage) {
    FlowPane root = new FlowPane();
    root.setPadding(new Insets(50));
    root.setHgap(20);
    root.setVgap(20);
    
    root.getChildren().addAll(
        new Label("Login:"),
        new TextField("username:"),
        
        new Label("password:"),
        new PasswordField(),
        new Button("Sign Up.")
    );
        
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
