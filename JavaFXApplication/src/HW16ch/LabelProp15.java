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
import javafx.scene.control.ComboBox;
import javafx.scene.control.ContentDisplay;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

/**
 *
 * @author Nurlybek
 */
public class LabelProp15 extends Application {
    ComboBox<String> cbo = new ComboBox<>();
    @Override
    public void start(Stage primaryStage) {
	cbo.getItems().addAll("TOP", "BOTTOM", "LEFT", "RIGHT");
	cbo.setStyle("-fx-color: green");
	cbo.setValue("LEFT");
	TextField tfGap = new TextField("0");
	tfGap.setPrefColumnCount(3);

	HBox paneForSettings = new HBox(10);
	paneForSettings.setAlignment(Pos.CENTER);
	paneForSettings.getChildren().addAll(new Label("contentDisplay:"), cbo, new Label("graphicTextGap:"), tfGap);
	
        ImageView image = new ImageView(new Image("http://findicons.com/files/icons/791/delicious_fruits/128/grape.png"));
	Label lblGrapes = new Label("Grapes", image);
        lblGrapes.setGraphicTextGap(0);

        StackPane paneForImage = new StackPane(lblGrapes);
	cbo.setOnAction(e -> {
            lblGrapes.setContentDisplay(setDisplay());
	});
	tfGap.setOnAction(e -> {
            lblGrapes.setGraphicTextGap(Integer.parseInt(tfGap.getText()));
	});
	BorderPane pane = new BorderPane();
	pane.setTop(paneForSettings);
	pane.setCenter(paneForImage);

	Scene scene = new Scene(pane, 400, 200);
	primaryStage.setTitle("ContentDisplay");
	primaryStage.setScene(scene); 
	primaryStage.show();
    }
    ContentDisplay setDisplay() {
	if (cbo.getValue().equals("TOP"))
            return ContentDisplay.TOP;
	else if (cbo.getValue().equals("BOTTOM"))
            return ContentDisplay.BOTTOM;
	else if (cbo.getValue().equals("LEFT"))
            return ContentDisplay.LEFT;
	else
            return ContentDisplay.RIGHT; 
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
}
