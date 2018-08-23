/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package HW16ch;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.Slider;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.scene.text.Text;
import javafx.stage.Stage;

/**
 *
 * @author Nurlybek
 */
public class Scrollbar17 extends Application {
    Text text = new Text("Show Colors");
    Slider slRed = new Slider();
    Slider slGreen = new Slider();
    Slider slBlue = new Slider();
    Slider slOpacity = new Slider();
    void setColor() {
	text.setFill(new Color(slRed.getValue(), slGreen.getValue(), slBlue.getValue(), slOpacity.getValue()));
    }
    @Override
    public void start(Stage primaryStage) {
	StackPane stackpane = new StackPane(text);
	stackpane.setPadding(new Insets(20, 10, 5, 10));
	slRed.setMin(0.0);
	slRed.setMax(1.0);
	slGreen.setMin(0.0);
	slGreen.setMax(1.0);
	slBlue.setMin(0.0);
	slBlue.setMax(1.0);
	slOpacity.setMin(0.0);
	slOpacity.setMax(1.0);
	slRed.valueProperty().addListener(e -> setColor());
	slGreen.valueProperty().addListener(e -> setColor());
	slBlue.valueProperty().addListener(e -> setColor());
	slOpacity.valueProperty().addListener(e -> setColor());
	slOpacity.setValue(1);
        
	GridPane sliders = new GridPane();
	sliders.setAlignment(Pos.CENTER);
	sliders.setVgap(5);
	sliders.setHgap(5);
	sliders.add(new Label("Red"), 0, 0);
	sliders.add(slRed, 1, 0);
	sliders.add(new Label("Green"), 0, 1);
	sliders.add(slGreen, 1, 1);
	sliders.add(new Label("Blue"), 0, 2);
	sliders.add(slBlue, 1, 2);
	sliders.add(new Label("Opacity"), 0, 3);
	sliders.add(slOpacity, 1, 3);

	BorderPane pane = new BorderPane();
	pane.setTop(stackpane);
	pane.setCenter(sliders);

	Scene scene = new Scene(pane, 250, 150);
	primaryStage.setTitle("Sliders");
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
