/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab2;

import javafx.animation.Animation;
import javafx.animation.FadeTransition;
import javafx.animation.KeyFrame;
import javafx.animation.PathTransition;
import javafx.animation.Timeline;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.Pane;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Line;
import javafx.scene.shape.Rectangle;
import javafx.scene.text.Font;
import javafx.scene.text.Text;
import javafx.stage.Stage;
import javafx.util.Duration;

/**
 *
 * @author Nurlybek
 */
public class Java1 extends Application {
    
    @Override
    public void start(Stage primaryStage) {
        
        /*
        Pane root = new Pane();
        Rectangle rec = new Rectangle(0, 0, 30, 50);
        rec.setFill(Color.BLUE);
        Circle cir = new Circle(125, 100, 50);
        cir.setFill(Color.WHITE);
        cir.setStroke(Color.WHITE);
        
        root.getChildren().add(cir);
        root.getChildren().add(rec);
        
        PathTransition pt = new PathTransition();
        pt.setNode(rec);
        pt.setPath(cir);
        pt.setDuration(Duration.seconds(4));
        pt.setCycleCount(Timeline.INDEFINITE);
        pt.setOrientation(PathTransition.OrientationType.ORTHOGONAL_TO_TANGENT);
        pt.setAutoReverse(true);
        pt.play();
      
        FadeTransition ft = new FadeTransition(Duration.seconds(4), rec);
        ft.setFromValue(1.0);
        ft.setToValue(0.0);
        ft.setCycleCount(Timeline.INDEFINITE);
        ft.play();
        ft.setAutoReverse(true);
        */
        
        //Timeline
        /*StackPane root = new StackPane();
        Text text = new Text(50, 50, "Timeline DEMO");
        text.setFill(Color.GRAY);
        text.setFont(Font.font(40));
        root.getChildren().add(text);
        EventHandler<ActionEvent> handler = (ActionEvent event) -> {
            if (text.getText().length()!=0) {
                text.setText("");
            } else {
                text.setText("Timeline Demo");
            }
        };
       
        Timeline t = new Timeline(new KeyFrame(Duration.seconds(0.5), handler));
        t.setCycleCount(Timeline.INDEFINITE);
        t.play();
        
        Scene scene = new Scene(root, 500, 100);
        
        scene.setOnMouseClicked((MouseEvent event) -> {
            if (t.getStatus() == Animation.Status.PAUSED) {
                t.play();
            } else {
                t.pause();
            };
        });
        
        */
        
        StackPane root = new StackPane();
        Text txt = new Text();
        txt.setText("Hello!");
        txt.setY(50);
        txt.setX(250);
        root.getChildren().add(txt);
        
        Line line = new Line();
        line.setStartX(0);
        line.setStartY(50);
        line.setEndY(50);
        line.setEndX(500);
        PathTransition pt = new PathTransition();
        pt.setNode(txt);
        pt.setPath(line);
        pt.setDuration(Duration.seconds(4));
        pt.setCycleCount(Timeline.INDEFINITE);
        pt.setOrientation(PathTransition.OrientationType.ORTHOGONAL_TO_TANGENT);
        pt.setAutoReverse(true);
        pt.play();
        
        Scene scene = new Scene(root, 500, 100);
        primaryStage.setTitle("Hello!");
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
