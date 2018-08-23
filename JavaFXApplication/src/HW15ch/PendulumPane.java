/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package HW15ch;

import javafx.animation.PathTransition;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Arc;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Line;
import javafx.util.Duration;

/**
 *
 * @author Nurlybek
 */
class PendulumPane extends Pane {
    double w = 400;
    double h;
    PathTransition path;
    Circle topC;
    Circle lowerC;
    Line line;
    Arc arc;
    public void play() {
        path.play();
    }
    public void stop(){
        path.pause();
    }
    public void increase() {
        path.setRate(path.getCurrentRate() + 1);
    }
    public void decrease() {
        path.setRate(path.getCurrentRate() - 1);
    }
    PendulumPane(double width, double height) {
        w = width;
        h = height;
        setPrefWidth(w);
        setPrefHeight(h);
        arc = new Arc(w / 2, h * 0.8, w * 0.15, w * 0.15, 180, 180);
        arc.setFill(Color.TRANSPARENT);
        arc.setStroke(Color.BLACK);

        lowerC = new Circle(arc.getCenterX() - arc.getRadiusX(), arc.getCenterY(), 10);
        topC = new Circle(arc.getCenterX(), arc.getCenterY() - h / 2, lowerC.getRadius() / 2);
        arc = new Arc(topC.getCenterX(), topC.getCenterY(), w / 2, h / 2, 240, 60);
        line = new Line(
                topC.getCenterX(), topC.getCenterY(),
                lowerC.getCenterX(), lowerC.getCenterY());
                line.endXProperty().bind(lowerC.translateXProperty().add(lowerC.getCenterX()));
                line.endYProperty().bind(lowerC.translateYProperty().add(lowerC.getCenterY()));
                path = new PathTransition();
                path.setDuration(Duration.millis(4000));
                path.setPath(arc);
                path.setNode(lowerC);
                path.setOrientation(PathTransition.OrientationType.NONE);
                path.setCycleCount(PathTransition.INDEFINITE);
                path.setAutoReverse(true);
                getChildren().addAll(lowerC, topC,line);
        }
}
