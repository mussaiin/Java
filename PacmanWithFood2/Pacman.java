import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.input.KeyEvent;
import javafx.stage.Stage;
/**
 *
 * @author Nurlybek
 */
public class Pacman extends Application {
    private static Map map;
    private MyPlayer player;
    private Food food;
    private BotPlayer bot;
    @Override
    public void start(Stage primaryStage) {
        map = new Map("map.txt");
        player = new MyPlayer(map);
        bot = new BotPlayer(map);
        food = new Food(map, player);
        Scene scene = new Scene(map, map.getSize()*map.getUnit(), map.getSize()*map.getUnit());

        scene.setOnKeyPressed((KeyEvent e)->{
            switch(e.getCode()){
                case DOWN:
                    player.moveDown();
                    break;
                case UP:
                    player.moveUp();
                    break;
                case LEFT:
                    player.moveLeft();
                    break;
                case RIGHT:
                    player.moveRight();
                    break;
                default:break;
            }
        });
        primaryStage.setTitle("Pacman from Guardians of Galaxy 2!");
        primaryStage.setScene(scene);
        primaryStage.show();
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //map = new Map(args[0]);
        launch(args);
    }

}
