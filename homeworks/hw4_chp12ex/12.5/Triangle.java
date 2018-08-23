import java.util.*;
import java.io.*;
import java.lang.*;

public class Triangle{
  double s1, s2, s3;
  Triangle(double s1, double s2, double s3) throws IllegalTriangleException{
    if((s1+s2)<s3 || (s2+s3)<s1 || (s1+s3)<s2)
			throw new IllegalTriangleException("Illegal Triangle");
		else{
      this.s1=s1;
      this.s2=s2;
      this.s3=s3;
    }
  }
  Triangle(){
    s1=1.0; s2=1.0; s3=1.0;
  }
  public String toString(){
    return "Triangle: s1 = " + s1 + " s2 = " + s2 + " s3 = " + s3;
  }
  public double getArea(){
    double p = (s1+s2+s3)/2.0;
    double area = Math.sqrt(p*(p-s1)*(p-s2)*(p-s3));
    return area;
  }
  public double getPerimeter(){
    return s1+s2+s3;
  }
}
