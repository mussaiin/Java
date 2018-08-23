import java.util.Date;
public class House implements Cloneable, Comparable<House>{
  int id;
  double area;
  Date WhenBuilt;
  House(int i, double d){
    id = i;
    area = d;
    WhenBuilt = new Date();
  }
  @Override
  public int compareTo(House o){
    if(area > o.area){
      return 1;
    }
    else if(area < o.area){
      return -1;
    }
    else return 0;
  }
  public Object clone() throws CloneNotSupportedException{
      return super.clone();
    }

}
