import java.util.*;
import java.io.*;
import java.lang.*;

public class Chicken extends Animal implements Edible{
  @Override
  public String sound(){
    return "Chicken:cock-a-doodle-doo";
  }

  @Override
  public String howToEat(){
    return "Chicken: Fry it";
  }
}