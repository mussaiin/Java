package task9;

public class Rectangle extends GeometricObject{
    double width;
    double height;
    public Rectangle() {
    }
    
    public Rectangle(double height, double width){
        this.height=height;
        this.width=width;
    }
    @Override
    public double getArea(){
        return width*height;
    }
}
