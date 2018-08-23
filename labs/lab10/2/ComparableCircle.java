
public class ComparableCircle extends Circle implements Comparable<ComparableCircle>{
  public ComparableCircle(int r){
    super(r);
  }
  @Override
  public int compareTo(ComparableCircle o){
    if(getArea()>o.getArea()){
      return 1;
    }
    else if(getArea()<o.getArea()){
      return -1;
    }
    else return 0;
  }
  public String toString(){
    return "Area:" +getArea();
  }
}
