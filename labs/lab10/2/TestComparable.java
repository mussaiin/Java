import java.util.Arrays;

public class TestComparable{
  public static void main(String [] args) throws Exception{
    ComparableRectangle [] r = {new ComparableRectangle(3, 5), new ComparableRectangle(6, 2), new ComparableRectangle(1, 7), new ComparableRectangle(2 ,10)};
    ComparableCircle [] c = {new ComparableCircle(1), new ComparableCircle(2), new ComparableCircle(3), new ComparableCircle(4)};

    Arrays.sort(r);
    Arrays.sort(c);

    ComparableRectangle r1 = new ComparableRectangle(2, 4);
    ComparableRectangle r2 = r1;
    r2.setWidth(12);
    System.out.println(r1);
    System.out.println(r2);

    for(ComparableCircle ce : c){
      System.out.println(ce);
    }

    System.out.println(r[1].compareTo(r[2]));
    System.out.println(r[3].compareTo(r[2]));

    House h = new House(1, 123.1);
    House h2 = (House) h.clone();
    System.out.println(h.id == h2.id);
    System.out.println(h == h2);
    System.out.println(h.WhenBuilt == h2.WhenBuilt);
  }
}
