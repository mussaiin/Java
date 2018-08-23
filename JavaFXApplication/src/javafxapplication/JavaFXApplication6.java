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
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;

/**
 *
 * @author Nurlybek
 */
public class JavaFXApplication6 extends Application {
    
    @Override
    public void start(Stage primaryStage) {
        BorderPane root = new BorderPane();
        Circle c = new Circle(40, Color.RED);
        root.setCenter(c);
        
        Button plus = new Button("+");
        Button minus = new Button("-");
        HBox hb = new HBox();
        hb.setSpacing(30);
        hb.setAlignment(Pos.CENTER);
        hb.getChildren().addAll(plus, minus);
        root.setBottom(hb);
        
        plus.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                if (c.getRadius()<100) {
                    c.setRadius(c.getRadius()+10);
                }
            }
        });
        minus.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                if (c.getRadius()>50) {
                    c.setRadius(c.getRadius()-10);
                }
            }
        });
        Scene scene = new Scene(root, 300, 300);
        
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
