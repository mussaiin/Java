class Rectangle extends Shape{
  int length;
  int width;
  Rectangle(String color, int l, int w){
    super(color);
    this.length=l;
    this.width=w;
  }
  Rectangle(){}
  public String toString(){
    return super.toString()+"; Shape: Rectangle; Length: "+ length + "; Width: "+ width;
  }
  double getArea(){
    area=length*width;
    return area;
  }
}
