public class Circle {
    private double r;
    double area;
    //like __init__
    public Circle(double n){
      r=n;
    }

    //2nd __init__ to work with s.name=...
    public Circle(){}

    //like __str__  
    public String toString(){
      return "Radius: "+r;
    }

    //setters and getters
    public void setR(int s){r=s;}
    public double getR(){return r;}
    public double getArea(){
      area=Math.PI*(r*r);
      return area;
    }
}
