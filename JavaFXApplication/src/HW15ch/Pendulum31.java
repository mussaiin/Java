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
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

/**
 *
 * @author Nurlybek
 */
public class Pendulum31 extends Application {
    
    @Override
    public void start(Stage primaryStage) throws Exception {

        PendulumPane pendulumPane = new PendulumPane(400, 400);

        Scene scene = new Scene(pendulumPane);
        primaryStage.setTitle("Pendulum Animation");
        primaryStage.setScene(scene);
        pendulumPane.play();
        primaryStage.show();

        scene.setOnKeyPressed(e-> {
            switch (e.getCode()) {
                case UP: pendulumPane.increase(); break;
                case DOWN: pendulumPane.decrease(); break;
                case ENTER: pendulumPane.play(); break;
                case S: pendulumPane.stop(); break;
            }
        });
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
    
}
