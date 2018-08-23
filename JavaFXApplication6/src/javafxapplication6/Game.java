/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javafxapplication6;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;
import javafxapplication6.MyPlayer;
import javafxapplication6.Game;

/**
 *
 * @author Admin
 */
public class Game extends Application {

    MyPlayer player = new MyPlayer();
    Map map = new Map("map.txt");
   

    @Override
    public void start(Stage primaryStage) {
        BorderPane root = new BorderPane();
        int[][] array = map.getMap();

        root.getChildren().add(map.drawTable());

        Circle ball = player.initializeBall();
        setBallActions(ball);
        root.getChildren().add(ball);
        

        Scene scene = new Scene(root, 400, 400);

        primaryStage.setTitle("EATER");
        primaryStage.setScene(scene);
        primaryStage.show();
        ball.requestFocus();
    }

    private void setBallActions(Circle ball) {
        Position position = map.getStartPosition();
        ball.setCenterX(position.getX() * map.getUnit() + 25);
        ball.setCenterY(position.getY() * map.getUnit() + 25);
        ball.setOnKeyPressed(e -> {
            switch (e.getCode()) {
                case UP:
                    player.moveUp();
                    break;
                case DOWN:
                    player.moveDown();
                    break;
                case RIGHT:
                    player.moveRight();
                    break;
                case LEFT:
                    player.moveLeft();
                    break;
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
