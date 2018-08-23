import javafx.scene.image.Image;
import javafx.scene.paint.Color;
import javafx.scene.paint.ImagePattern;
import javafx.scene.shape.Circle;
/**
 *
 * @author Nurlybek
 */
public class MyPlayer implements Player{
  private Circle ball;
  private Map map;
  private Position pos;
  Image imgRight = new Image("file://localhost////Users/Nurlybek/Documents/NetBeansProjects/PacmanWithFood2/pacman2.gif");
  Image imgLeft = new Image("file://localhost////Users/Nurlybek/Documents/NetBeansProjects/PacmanWithFood2/pacman.gif");

  public MyPlayer(Map map) {
      this.map = map;
      pos = map.getPosition();
      ball = new Circle(pos.getX()*map.getUnit() + map.getUnit()/2, pos.getY()*map.getUnit() + map.getUnit()/2, map.getUnit()/2);
      ball.setFill(new ImagePattern(imgRight));
      ball.setStroke(Color.BLACK);
      ball.setStrokeWidth(1.5);
      map.getChildren().add(ball);
  }

  @Override
  public void moveDown() {
    Position nextPosition = new Position(pos.getX(), pos.getY() + 1);
    if (map.isEmpty(nextPosition)){
          ball.setCenterY(ball.getCenterY() + map.getUnit());
          pos = nextPosition;
    }
  }

  @Override
  public void moveLeft() {
    Position nextPosition = new Position(pos.getX() - 1, pos.getY());
    ball.setFill(new ImagePattern(imgLeft));
    if (map.isEmpty(nextPosition)){
      ball.setCenterX(ball.getCenterX() - map.getUnit());
      pos = nextPosition;
    }
  }

  @Override
  public void moveRight() {
    Position nextPosition = new Position(pos.getX() + 1, pos.getY());
    ball.setFill(new ImagePattern(imgRight));
    if (map.isEmpty(nextPosition)){
          ball.setCenterX(ball.getCenterX() + map.getUnit());
          pos = nextPosition;
    }
  }

    @Override
    public void moveUp() {
      Position nextPosition = new Position(pos.getX(), pos.getY() - 1);
      if (map.isEmpty(nextPosition)){
        ball.setCenterY(ball.getCenterY() - map.getUnit());
        pos = nextPosition;
	    }
    }

    @Override
    public Position getPosition() {
        return pos;
    }
}
