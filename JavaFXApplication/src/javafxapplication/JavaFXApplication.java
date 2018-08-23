/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javafxapplication;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.TextField;
import javafx.scene.layout.Pane;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;

/**
 *
 * @author Nurlybek
 */
public class JavaFXApplication extends Application {
    
    @Override
    public void start(Stage primaryStage) {
        Pane root = new Pane();
        Rectangle r = new Rectangle();
        r.xProperty().bind(root.heightProperty().divide(2));
        r.yProperty().bind(root.widthProperty().divide(2));
        
        Rectangle r2 = new Rectangle();
        r.setWidth(100);
        r.setHeight(200);
        /*c.radiusProperty().bind(root.heightProperty().divide(4));
        c.setCenterX(100);
        c.setCenterY(100);
        c.centerXProperty().bind(root.widthProperty().divide(2));
        c.centerYProperty().bind(root.heightProperty().divide(2));
        c.setFill(Color.BLUE);
        c.setStroke(Color.BLACK);*/
        /*Button btn = new Button();
        btn.setText("Say 'Hello World'");
        btn.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                System.out.println("Hello World!");
            }
        });*/
        
        
        root.getChildren().add(r);
        
        Scene scene = new Scene(root, 200, 200);
        
        primaryStage.setTitle("Hello World!");
        primaryStage.setScene(scene);
        primaryStage.show();
        /*
        Stage stage2 = new Stage();
        StackPane sp = new StackPane();
        TextField tf = new TextField("Enter here:");
        sp.getChildren().add(tf);
        Scene scene2 = new Scene(sp, 500, 250);
        stage2.setScene(scene2);
        stage2.show();
        */
    }


    public JavaFXApplication() {
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
    
}
