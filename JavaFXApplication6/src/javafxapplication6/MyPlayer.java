/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javafxapplication6;

import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Rectangle;

/**
 *
 * @author Admin
 */
public class MyPlayer implements Player {

    private Circle ball;
    private Map map;
    private Position position;

    public Circle initializeBall() {
        ball = new Circle();
        ball.setFill(Color.RED);
        ball.setRadius(25);
        return ball;
    }

    @Override
    public void moveRight() {
        if (map.getMap()[((int)ball.getCenterY())/50+1][((int)ball.getCenterY())/50]!=1) {
            ball.setCenterX(ball.getCenterX() + 50);       
        }
    }

    @Override
    public void moveLeft() {
        if (map.getMap()[((int)ball.getCenterY())/50-1][((int)ball.getCenterY())/50]!=1) {
         ball.setCenterX(ball.getCenterX() - 50);       
        }
    }

    @Override
    public void moveUp() {
        if (map.getMap()[((int)ball.getCenterY())/50][((int)ball.getCenterY())/50+1]!=1) {
         ball.setCenterY(ball.getCenterY() - 50);
        }
    }

    @Override
    public void moveDown() {
        if (map.getMap()[((int)ball.getCenterY())/50][((int)ball.getCenterY())/50-1]==0) {
         ball.setCenterY(ball.getCenterY() + 50);
        }
    }

    @Override
    public Position getPosition() {
        position = new Position((int) ball.getCenterX(), (int) ball.getCenterY());
        return position;
    }
}