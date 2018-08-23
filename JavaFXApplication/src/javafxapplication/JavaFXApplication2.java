/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javafxapplication;

import javafx.application.Application;
import static javafx.application.Application.launch;
import javafx.scene.Scene;
import javafx.scene.control.TextField;
import javafx.scene.layout.Pane;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.text.Font;
import javafx.scene.text.FontPosture;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.stage.Stage;

/**
 *
 * @author Nurlybek
 */
public class JavaFXApplication2 extends Application {
    
    @Override
    public void start(Stage primaryStage) {
        StackPane root = new StackPane();
        Circle c = new Circle();
        c.radiusProperty().bind(root.heightProperty().divide(4));
        /*c.setCenterX(100);
        c.setCenterY(100);*/
        c.centerXProperty().bind(root.widthProperty().divide(2));
        c.centerYProperty().bind(root.heightProperty().divide(2));
        c.setFill(Color.BLUE);
        c.setStroke(Color.BLACK);
        c.setStyle("-fx-fill:blue;" + "-fx-stroke:black;");
        /*Button btn = new Button();
        btn.setText("Say 'Hello World'");
        btn.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                System.out.println("Hello World!");
            }
        });*/
        
        Text text = new Text("JAVA FX");
        text.setFont(Font.font("Arial", FontWeight.BOLD, FontPosture.ITALIC, 30));
        root.getChildren().add(text);
        //root.setStyle("-fx-background-color:green");
        //root.setRotate(45);
        Scene scene = new Scene(root, 200, 200);
        
        primaryStage.setTitle("Hello World!");
        primaryStage.setScene(scene);
        primaryStage.show();
        
        Stage stage2 = new Stage();
        StackPane sp = new StackPane();
        TextField tf = new TextField("Enter here:");
        sp.getChildren().add(tf);
        Scene scene2 = new Scene(sp, 500, 250);
        stage2.setScene(scene2);
        stage2.show();
    }


    public JavaFXApplication2() {
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
    
}
