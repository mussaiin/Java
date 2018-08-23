class TestShape{
    public static void main(String [] args){
      Shape tr = new Triangle("green", 3, 4);
      Shape re = new Rectangle("red", 3, 4);
      System.out.println(tr);
      System.out.println(tr.getArea());
      System.out.println(re);
      System.out.println(re.getArea());
    }
}
