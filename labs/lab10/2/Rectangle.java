
public class Rectangle extends GeometricObject{
  int width;
  int hight;
  Rectangle(){}
  Rectangle(int width,int hight){this.width=width;this.hight=hight;}

  void setWidth(int width){this.width=width;}
  int getW(){return width;}

  void setHight(int hight){this.hight=hight;}
  int getH(){return hight;}

  public String toString(){return super.toString()+"Rectangle: w="+width+",h="+hight;}

  double getArea(){
    return hight*width;
  }
  double getPerimeter(){
    return (hight+width)*2;
  }
}
