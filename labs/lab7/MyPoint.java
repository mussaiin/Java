import java.lang.Math;

public class MyPoint {
private double x;
private double y;

public MyPoint(double x, double y)
{
    this.x=x;
    this.y=y;
}

public void setX(double x) {
    this.x = x;
}

public void setY(double y) {
    this.y = y;
}

public double getX() {
    return x;
}

public double getY()
{
    return y;
}
public double distance (MyPoint another)
{
    return Math.sqrt(Math.pow((another.getX()-getX()),2)+(Math.pow((another.getY()-getY()),2)));
}
public MyPoint midpoint(MyPoint another)
{
    MyPoint point = new MyPoint((another.getX()+getX()/2),(another.getY()+getY())/2);
    return point;
}
}
