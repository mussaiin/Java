/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javafxapplication;

import com.oracle.deploy.update.Updater;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import static javafx.geometry.VerticalDirection.DOWN;
import static javafx.geometry.VerticalDirection.UP;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import static javafx.scene.control.ButtonBar.ButtonData.LEFT;
import static javafx.scene.control.ButtonBar.ButtonData.RIGHT;
import javafx.scene.input.KeyEvent;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.Pane;
import javafx.scene.layout.StackPane;
import javafx.scene.text.Font;
import javafx.scene.text.Text;
import javafx.stage.Stage;

/**
 *
 * @author Nurlybek
 */
public class JavaFXApplication7 extends Application {
    
    @Override
    public void start(Stage primaryStage) {
        Pane root = new Pane();
        
        Text txt = new Text(140, 130, "a");
        txt.setFont(Font.font(40));
        
        txt.setOnKeyPressed(new EventHandler<KeyEvent>(){
            @Override
            public void handle(KeyEvent e){
                switch(e.getCode()){
                    case UP: txt.setY(txt.getY()-10);break;
                    case DOWN: txt.setY(txt.getY()+10);break;
                    case LEFT: txt.setX(txt.getX()-10);break;
                    case RIGHT: txt.setX(txt.getX()+10);break;
                    default: if(Character.isLetterOrDigit(e.getText().charAt(0)))
                        txt.setText(e.getText());
                        break;
                }
            }
        });
        txt.setOnMouseDragged(new EventHandler<MouseEvent>(){
            @Override
            public void handle(MouseEvent e){
                txt.setX(e.getX());
                txt.setY(e.getY());
            }
        });
        root.getChildren().add(txt);
        Scene scene = new Scene(root, 300, 250);
        
        primaryStage.setTitle("Stage1");
        primaryStage.setScene(scene);
        primaryStage.show();
        txt.requestFocus();
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
    
}
