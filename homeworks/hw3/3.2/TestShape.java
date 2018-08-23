class TestShape{
    public static void main(String [] args){
      Circle cr = new Circle(1, "green", true);
      Rectangle re = new Rectangle();
      re.setLength(1);
      re.setWidth(2);
      re.setColor("blue");
      re.setFilled(false);
      Square sq = new Square(3, "red", true);

      System.out.println(cr);
      System.out.println(cr.getArea());
      System.out.println(cr.getRadius());
      System.out.println(cr.getPerimeter());

      System.out.println(re);
      System.out.println(re.getArea());
      System.out.println(re.getPerimeter());
      System.out.println(re.getLength());
      System.out.println(re.getWidth());
      System.out.println(re.isFilled());

      System.out.println(sq);
      System.out.println(sq.getArea());
      System.out.println(sq.getPerimeter());
      System.out.println(sq.getSide());
    }
}
