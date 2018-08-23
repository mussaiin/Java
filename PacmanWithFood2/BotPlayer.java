import javafx.scene.image.Image;
import javafx.scene.paint.Color;
import javafx.scene.paint.ImagePattern;
import javafx.scene.shape.Circle;
/**
 *
 * @author Nurlybek
 */
public class BotPlayer implements Player{
  private Circle bot;
  private Map map;
  private Position pos;
  Image imgBot = new Image("file://localhost////Users/Nurlybek/Documents/NetBeansProjects/PacmanWithFood2/bot.png");

  public BotPlayer(Map map) {
      this.map = map;
      pos = map.getBotPosition();
      bot = new Circle(pos.getX()*map.getUnit() + map.getUnit()/2, pos.getY()*map.getUnit() + map.getUnit()/2, map.getUnit()/2);
      bot.setFill(new ImagePattern(imgBot));
      bot.setStroke(Color.BLACK);
      bot.setStrokeWidth(1.5);
      map.getChildren().add(bot);
  }

  @Override
  public void moveDown() {
    Position nextPosition = new Position(pos.getX(), pos.getY() + 1);
    if (map.isEmpty(nextPosition)){
          bot.setCenterY(bot.getCenterY() + map.getUnit());
          pos = nextPosition;
    }
  }

  @Override
  public void moveLeft() {
    Position nextPosition = new Position(pos.getX() - 1, pos.getY());
    if (map.isEmpty(nextPosition)){
      bot.setCenterX(bot.getCenterX() - map.getUnit());
      pos = nextPosition;
    }
  }

  @Override
  public void moveRight() {
    Position nextPosition = new Position(pos.getX() + 1, pos.getY());
    if (map.isEmpty(nextPosition)){
          bot.setCenterX(bot.getCenterX() + map.getUnit());
          pos = nextPosition;
    }
  }

    @Override
    public void moveUp() {
      Position nextPosition = new Position(pos.getX(), pos.getY() - 1);
      if (map.isEmpty(nextPosition)){
        bot.setCenterY(bot.getCenterY() - map.getUnit());
        pos = nextPosition;
	    }
    }

    @Override
    public Position getPosition() {
        return pos;
    }
}
