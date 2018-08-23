class Shape{
  private String color="";
  int area=0;
  Shape(String color){
    this.color=color;
  }
  Shape(){}
  public String toString(){
    return "Color: "+color;
  }
  double getArea(){
    return area;
  }
}
