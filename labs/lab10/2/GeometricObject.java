
public abstract class GeometricObject {
    public String color="red";
    public boolean filled=true;

    GeometricObject(){}
    GeometricObject(String color,boolean filled){this.color=color;this.filled=filled;}

    public String getColor(){return color;}
    public void setColor(String color){this.color=color;}

    public boolean isFilled(){return filled;}
    public void setFilled(boolean filled){this.filled=filled;}

    public String toString(){
      return "A geometric object with color of"+color+"(Filled:"+filled+")";
    }
    abstract double getArea();
    abstract double getPerimeter();
}
