public class Point2D {
    private double x;
    private double y;


    public Point2D(double n, double m){x=n; y=m;}
    //2nd __init__ to work with s.name=...
    public Point2D(){}
    //like __str__
    public String toString(){
      return x+", "+y;
    }

    //setters and getters
    public void setX(double s){x=s;}
    public double getX(){return x;}

    public void setY(double s){y=s;}
    public double getY(){return y;}

    public void setXY(double s, double s1){
      x=s;
      y=s1;
    }
    public double[] getXY(){
      double[] n = {x, y};
      return n;
    }

}
