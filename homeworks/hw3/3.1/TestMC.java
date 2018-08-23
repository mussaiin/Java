public class TestMC{
  public static void main(String [] args){
    MyComplex n1 = new MyComplex(1.1, 2.2);
    MyComplex n2 = new MyComplex(3.3, 4.4);
    System.out.println(n1.equals(1.1, 2.2));
    System.out.println(n1.equals(n2));
    System.out.println(n1.magnitude());
    System.out.println(n1.argument());
    System.out.println(n1.add(n2));
    System.out.println(n2.substract(n1));
    System.out.println(n1.addNew(n2));
    System.out.println(n1.multiply(n2));
    System.out.println(n1.divide(n2));
    System.out.println(n1.conjugate());
  }
}
