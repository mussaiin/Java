public class Point3D extends Point2D{
  private double z;

  Point3D(){}

  Point3D(double s, double n, double d){
    super(s,n);
    z = d;
  }

  public String toString(){
    return super.toString()+" "+z;
  }

  public void setZ(double s){z=s;}
  public double getZ(){return z;}

  public void setXYZ(double s, double s1, double s2){
    setXY(s, s1);
    z=s2;
  }
  public double[] getXYZ(){
    double[] n = {getX(), getY(), z};
    return n;
  }

}
