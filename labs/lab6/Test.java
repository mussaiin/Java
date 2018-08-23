public class Test{
    public static void main(String[] args){
      Point2D p = new Point2D();
      p.setX(1.0);
      p.setY(2.0);
      System.out.println(p);

      Point2D p2 = new Point2D(2.5, 1.5);
      //p2.setXY(21, 3.6);
      System.out.println(p2);

      Point3D p4 = new Point3D();
      p4.setXYZ(11, 2.5, 5);
      System.out.println(p4);
      System.out.println(p4.getXYZ());
    }
}
