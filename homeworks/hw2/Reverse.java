import java.util.*;

public class Reverse {
  public static int[] reverse(int[] n){
    int temp;
    for(int i=0, j=3; i<=n.length-1; i++, j--){
      temp=n[i];
      n[i]=n[j];
      n[j]=temp;
    }
    return n;
  }
  public static void main(String [] args){
    int[] a = {1,2,3,4};
    int[] b = reverse(a);
    for (int i=0; i<a.length; i++) {
      System.out.println(b[i]);
    }
  }
}
