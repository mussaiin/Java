public class Rectangle {
    double height;
    double width;
    double area;
    double perimeter;
    //like __init__
    public Rectangle(double n, double m){
      height=n;
      width=m;
    }

    //2nd __init__ to work with s.name=...
    public Rectangle(){}

    //like __str__
    public String toString(){
      return "Height is: "+height+"\nWidth is: "+width;
    }

    //setters and getters
    public void setHeight(double s){height=s;}
    public void setWidth(double s){width=s;}


    public double getArea(){
      area=height*width;
      return area;
    }
    public double getPerimeter(){
      perimeter=(height+width)*2;
      return perimeter;
    }
    public static void main(String ){
      Rectangle r1= new Rectangle(3, 4);
      System.out.println("Area is: "+r1.getArea());
    }
}
