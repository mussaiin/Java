class Triangle extends Shape{
  int base;
  int height;
  Triangle(String color, int b, int h){
    super(color);
    this.base=b;
    this.height=h;
  }
  Triangle(){}
  public String toString(){
    return super.toString()+"; Shape: Triangle; Base: "+ base + "; Height: "+ height;
  }
  double getArea(){
    area=(base*height)/2;
    return area;
  }
}
