import java.util.*;
import java.lang.*;
import java.io.*;

class Shape{
  private String color="red";
  boolean filled = true;
  public Shape(String color, boolean filled){
    this.color=color;
    this.filled = filled;
  }
  public Shape(){}
  public String toString(){
    if(filled){
      return "A Shape with color of "+color+" and Filled";
    }
    else{
      return "A Shape with color of "+color+" and  Not Filled";
    }
  }

  public void setColor(String color){
    this.color=color;
  }
  public String getColor(){
    return color;
  }
  public boolean isFilled(){
    return filled;
  }
  public void setFilled(boolean filled){
    this.filled=filled;
  }
}
