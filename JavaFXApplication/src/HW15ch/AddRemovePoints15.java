/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package HW15ch;

import javafx.application.Application;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.input.MouseButton;
import javafx.scene.layout.Pane;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;

/**
 *
 * @author Nurlybek
 */
public class AddRemovePoints15 extends Application {
    Pane pane = new Pane();
    
    Circle drawPoint(double x, double y) {
        Circle c = new Circle(x, y, 10, Color.TRANSPARENT);
        c.setStroke(Color.BLACK);
        return c;
    }
    void removePoint(double x, double y) {
        ObservableList<Node> list = pane.getChildren();
        for (int i = list.size() - 1; i >= 0; i--) {
            Node c = list.get(i);
            if (c instanceof Circle && c.contains(x, y)) {
                pane.getChildren().remove(c);
                break;
            }
        }
    }
    @Override
    public void start(Stage primaryStage) {

        pane.setOnMouseClicked(e-> {
            double x = e.getX();
            double y = e.getY();
            if (e.getButton() == MouseButton.PRIMARY) {
                Circle c = drawPoint(x,y);
                pane.getChildren().add(c);
            } 
            else if (e.getButton() == MouseButton.SECONDARY) {
                removePoint(x, y);
            }
        });

        Scene scene = new Scene(pane, 400, 400);
        primaryStage.setScene(scene);
        primaryStage.setTitle("Circle");
        primaryStage.show();
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
    
}
