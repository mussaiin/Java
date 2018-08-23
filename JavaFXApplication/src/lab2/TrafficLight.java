/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab2;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.RadioButton;
import javafx.scene.control.ToggleGroup;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;

/**
 *
 * @author Nurlybek
 */
public class TrafficLight extends Application {
    
    @Override
    public void start(Stage primaryStage) {
        
        BorderPane root = new BorderPane();
        Pane pane = new Pane();
        Rectangle r = new Rectangle(110, 10, 80, 220);
        r.setFill(Color.WHITE);
        r.setStroke(Color.BLACK);
        
        Circle cred = new Circle(150, 50, 30, Color.WHITE);
        Circle cyellow = new Circle(150, 120, 30, Color.WHITE);
        Circle cgreen = new Circle(150, 190, 30, Color.WHITE);
        
        cred.setStroke(Color.BLACK);
        cyellow.setStroke(Color.BLACK);
        cgreen.setStroke(Color.BLACK);
        
        pane.getChildren().addAll(r, cred, cyellow, cgreen);
        root.setCenter(pane);
        
        RadioButton rRed = new RadioButton("Red");
        RadioButton rYellow = new RadioButton("Yellow");
        RadioButton rGreen = new RadioButton("Green");
        
        ToggleGroup tg = new ToggleGroup();
        rRed.setToggleGroup(tg);
        rYellow.setToggleGroup(tg);
        rGreen.setToggleGroup(tg);
        
        HBox hb = new HBox(5);
        hb.setAlignment(Pos.CENTER);
        hb.getChildren().addAll(rRed, rYellow, rGreen);
        root.setBottom(hb);
        
        rGreen.setOnAction(e -> {
            if(rGreen.isSelected()){
                cgreen.setFill(Color.GREEN);
                cred.setFill(Color.WHITE);
                cyellow.setFill(Color.WHITE);
            }
        });
        rYellow.setOnAction(e -> {
            if(rYellow.isSelected()){
                cyellow.setFill(Color.YELLOW);
                cred.setFill(Color.WHITE);
                cgreen.setFill(Color.WHITE);
            }
        });
        rRed.setOnAction(e -> {
            if(rRed.isSelected()){
                cred.setFill(Color.RED);
                cgreen.setFill(Color.WHITE);
                cyellow.setFill(Color.WHITE);
            }
        });
        
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
