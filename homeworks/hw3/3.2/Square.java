class Square extends Rectangle{
  public Square(){}
  public Square(double side){
    super(side, side);
  }
  public Square(double side, String color, boolean filled){
    super(side, side, color, filled);
  }

  public double getSide(){
    return length;
  }
  public void setSide(double side){
    super.length=side;
    super.width=side;
  }

  public void setWidth(double width){
    super.width=width;
    super.length=length;
  }
  public void setLength(double length){
    super.length=length;
    super.width=width;
  }
  public String toString(){
    return "A Square with side="+length+", which is a subclass of Rectangle";
  }
}
