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
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.scene.text.Text;
import javafx.stage.Stage;

/**
 *
 * @author Nurlybek
 */
public class InsideRec13 extends Application {
 
    @Override
    public void start(Stage primaryStage) {
        double width = 400;
        double height = 300;
        Rectangle rec = new Rectangle(100, 60, 100, 40);
        rec.setFill(Color.TRANSPARENT);
        rec.setStroke(Color.BLACK);

        Pane pane = new Pane(rec);
        Scene scene = new Scene(pane, width, height);
        Text text = new Text();
        pane.getChildren().add(text);
        pane.setOnMouseMoved(e-> {
            double x = e.getX();
            double y = e.getY();
            text.setX(x);
            text.setY(y);
            if (rec.contains(x, y)) {
                text.setText("Inside");
            } 
            else {
                text.setText("Outside");
            }
        });
        primaryStage.setScene(scene);
        primaryStage.setTitle("Rectangle");
        primaryStage.show();

    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
    
}
