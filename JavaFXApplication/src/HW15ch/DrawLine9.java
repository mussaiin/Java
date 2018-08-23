/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package HW15ch;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.Pane;
import javafx.scene.layout.StackPane;
import javafx.scene.shape.Line;
import javafx.stage.Stage;

/**
 *
 * @author Nurlybek
 */
public class DrawLine9 extends Application {
    Pane pane = new Pane();
    double width = 400;
    double height = 400;
    double cX = width / 2;
    double cY = height / 2;
    void moveUp() {
        pane.getChildren().add(new Line(cX, cY, cX, cY - 10));
        cY -= 10;
    }
    void moveDown() {
        pane.getChildren().add(new Line(cX, cY, cX, cY + 10));
        cY += 10;
    }
    void moveLeft() {
        pane.getChildren().add(new Line(cX, cY, cX - 10, cY));
        cX -= 10;
    }
    void moveRight() {
        pane.getChildren().add(new Line(cX, cY, cX + 10, cY));
        cX += 10;
    }
    @Override
    public void start(Stage primaryStage) {
        pane.setOnKeyPressed(e -> {
            switch (e.getCode()) {
                case UP: moveUp(); break;
                case DOWN: moveDown(); break;
                case LEFT: moveLeft(); break;
                case RIGHT: moveRight(); break;
            }
        });

        primaryStage.setScene(new Scene(pane, width, height));
        primaryStage.setTitle("Draw Line");
        primaryStage.show();
        pane.requestFocus();
    }
     /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
    
}
