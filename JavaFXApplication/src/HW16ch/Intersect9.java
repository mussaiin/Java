/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package HW16ch;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.HPos;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ContentDisplay;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.scene.text.Text;
import javafx.stage.Stage;

/**
 *
 * @author Nurlybek
 */
public class Intersect9 extends Application {
    Rectangle rectangle = getRectangle();
    Pane paneForRectangles = new Pane(rectangle);
    TablePane table = new TablePane();
    @Override
    public void start(Stage primaryStage) {
        paneForRectangles.getChildren().addAll(table.getRectangle1(), table.getRectangle2());
	Button btRedrawCircles = new Button("Redraw Rectangles");
	VBox pane = new VBox();
	pane.setAlignment(Pos.CENTER);
	pane.getChildren().addAll(intersect(), paneForRectangles, table, btRedrawCircles);
	btRedrawCircles.setOnAction(e -> {
            table.redraw();
            pane.getChildren().remove(0);
            pane.getChildren().add(0, intersect());
	});

	table.getRectangle1().setOnMouseDragged(e -> {
            if (table.getRectangle1().contains(e.getX(), e.getY())) {
                table.setRectangle1X(e.getX() - (table.getRectangle1Width() / 2));
                table.setRectangle1Y(e.getY() - (table.getRectangle1Height() / 2));
                table.setTfRectangle1X(String.valueOf(e.getX() - (table.getRectangle1Width() / 2)));
                table.setTfRectangle1Y(String.valueOf(e.getY() - (table.getRectangle1Height() / 2)));
            }
            pane.getChildren().remove(0);
            pane.getChildren().add(0, intersect());
	});

	table.getRectangle2().setOnMouseDragged(e -> {
            if (table.getRectangle2().contains(e.getX(), e.getY())) {
		table.setRectangle2X(e.getX() - (table.getRectangle2Width() / 2));
		table.setRectangle2Y(e.getY() - (table.getRectangle2Height() / 2));
		table.setTfRectangle2X(String.valueOf(e.getX() - (table.getRectangle2Width() / 2)));
		table.setTfRectangle2Y(String.valueOf(e.getY() - (table.getRectangle2Height() / 2)));
            }
            pane.getChildren().remove(0);
            pane.getChildren().add(0, intersect());
	});
	Scene scene = new Scene(pane);
	primaryStage.setTitle("Intersect"); 
	primaryStage.setScene(scene); 
	primaryStage.show(); 
    }
    Text intersect() {
        if(isIntersect()){return new Text("Two circles intersect? YES");}
        else{return new Text("Two circles intersect? NO");}
    }

    boolean isIntersect() {
		return 
			(getDistance(table.getRectangle2X(), table.getRectangle1X() + 
				table.getRectangle1Width()) < 
				table.getRectangle1Width() + table.getRectangle2Width() &&
		  	(getDistance(table.getRectangle2Y(), table.getRectangle1Y() + 
		  		table.getRectangle1Height()) < 
		  		table.getRectangle1Height() + table.getRectangle2Height())) &&
			(getDistance(table.getRectangle1X(), table.getRectangle2X() + 
				table.getRectangle2Width()) < 
				table.getRectangle1Width() + table.getRectangle2Width() &&
		  	(getDistance(table.getRectangle1Y(), table.getRectangle2Y() + 
		  		table.getRectangle2Height()) < 
		  		table.getRectangle1Height() + table.getRectangle2Height())); 
    }
    double getDistance(double p1, double p2) {
    	return Math.sqrt(Math.pow(p2 - p1, 2));
    }
    Rectangle getRectangle() {
        Rectangle r = new Rectangle(0, 0, 280, 110);
	r.setStroke(Color.WHITE);
	r.setFill(Color.WHITE);
	return r;
    }
    /*
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
    
}
