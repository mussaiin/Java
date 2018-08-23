import java.util.*;

public class PrintChart {

    public static void readInput(int[] a){
      Scanner scan = new Scanner(System.in);
      for(int i=0; i<a.length; i++){
        System.out.printf("Enter bar %d value: ", i+1);
        a[i]=scan.nextInt();
      }
    }

    public static void printChart(int[] a){
      for (int i=0; i<a.length; i++) {
        for (int j=0; j<a[i]; j++) {
          System.out.print("*");
        }
        System.out.printf("( %d )\n", a[i]);
      }
    }

    public static void main(String [] args){
      Scanner scan = new Scanner(System.in);
      System.out.printf("Enter the number of bars: ");
      int n[] = new int[scan.nextInt()];
      readInput(n);
      printChart(n);
    }
}
