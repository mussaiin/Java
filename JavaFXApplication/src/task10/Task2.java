package task10;

import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.image.ImageView;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

public class Task2 extends Application {
    static int y = 350;
    ImageView iv = new ImageView("http://www.flagpoleworld.com.au/media/catalog/product/cache/7/image/9df78eab33525d08d6e5fb8d27136e95/k/a/kazakhstan_flag__52b10b4e40c7c.gif");
    public void start(Stage primaryStage) {
        Pane pane = new Pane();
        iv.setX(10);
        iv.setFitHeight(150);
        iv.setFitWidth(250);
        
        new Thread(new ImgMover()).start();
        pane.getChildren().add(iv);
        Scene scene = new Scene(pane, 300, 250);
        primaryStage.setTitle("Task3");
        primaryStage.setScene(scene);
        primaryStage.show();}
    public static void main(String[] args) {launch(args);}

    class ImgMover implements Runnable {
        @Override
        public void run() {
            while (y >= 0) {
                y--;
                iv.setY(y);
                try {
                    Thread.sleep(10);
                } catch (InterruptedException ex){ex.printStackTrace();}
            }
        }
    }
}
