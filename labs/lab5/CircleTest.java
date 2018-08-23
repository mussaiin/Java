public class CircleTest{
    public static void main(String[] args){
      Circle n = new Circle();
      n.setR(5);
      Circle n2 = new Circle(4.5);
      System.out.println(n);
      System.out.println("Area of n: "+n.getArea());
      System.out.println(n2);
      System.out.println("Area of n2: "+n2.getArea());
    }
}
