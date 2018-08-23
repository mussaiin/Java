/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package HW16ch;
import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.layout.StackPane;
import javafx.scene.control.TextField;
import javafx.util.Duration;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;
import javafx.geometry.Pos;
import javafx.scene.text.Font;
import javafx.scene.input.KeyCode;
import javafx.animation.Timeline;
import javafx.animation.KeyFrame;
import javafx.event.EventHandler;
import javafx.scene.input.KeyEvent;
/**
 *
 * @author Nurlybek
 */
public class MusicTimer21 extends Application {
    void run() {
	if (Integer.parseInt(count.getText()) > 0) {
            mediaPlayer.pause();
            mediaPlayer.seek(Duration.ZERO);
            count.setText(String.valueOf(Integer.parseInt(count.getText()) - 1));
        }
	if (count.getText().equals("0")) {
            animation.pause();
            mediaPlayer.play();
	}
    }
    TextField count = new TextField();
    Media media = new Media("file://localhost///Users/Nurlybek/Desktop/led.mp3");
    MediaPlayer mediaPlayer = new MediaPlayer(media);
    Timeline animation;
    @Override
    public void start(Stage primaryStage) {
        count.setAlignment(Pos.CENTER);
	count.setFont(Font.font(60));
	count.setPrefColumnCount(4);
	mediaPlayer.setCycleCount(MediaPlayer.INDEFINITE);
	
        StackPane pane = new StackPane(count);
	animation = new Timeline(new KeyFrame(Duration.seconds(1), e -> run()));
	animation.setCycleCount(Timeline.INDEFINITE);
	count.setOnKeyPressed(new EventHandler<KeyEvent>() {
            @Override
            public void handle(KeyEvent e) {
                if (e.getCode() == KeyCode.ENTER) {animation.play();}
            }
        });
	Scene scene = new Scene(pane);
	primaryStage.setTitle("MusicTimer"); 
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
