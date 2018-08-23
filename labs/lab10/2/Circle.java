import java.util.*;
import java.io.*;
import java.lang.*;

public class Circle extends GeometricObject{
  int r;
  Circle(){}
  Circle(int r){this.r=r;}

  void setR(int r){this.r=r;}
  int getR(){return r;}

  public String toString(){return super.toString()+"Circle: r="+r;}

  double getArea(){
    return Math.PI*(r*r);
  }
  double getPerimeter(){
    return (Math.PI*r)*2;
  }
}
