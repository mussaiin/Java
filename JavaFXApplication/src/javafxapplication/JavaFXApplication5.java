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
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.FlowPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;
import javafx.scene.text.Font;
import javafx.scene.text.Text;
import javafx.stage.Stage;
import sun.font.TextLabel;

/**
 *
 * @author Nurlybek
 */
public class JavaFXApplication5 extends Application {
    
    @Override
    public void start(Stage primaryStage) {
    BorderPane root = new BorderPane();
    HBox hb = new HBox();
    hb.getChildren().addAll(
            new Text("BOTTOM"), new Text("BOTTOM"),
            new Text("BOTTOM"), new Text("BOTTOM"),
            new Text("BOTTOM"), new Text("BOTTOM")
    );
    
    Image img = new Image("file://localhost///Users/Nurlybek/Pictures/Wallpapers/2016-ford-mustang-rocket-exterior-1.jpg");
    ImageView iv = new ImageView(img);
    iv.setFitHeight(400);
    iv.setFitWidth(500);
    
    root.setTop(new Text("TOP"));
    root.setBottom(hb);
    root.setRight(new Text("RIGHT"));
    root.setLeft(new Text("LEFT"));
    root.setCenter(iv);
    
    
        
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
