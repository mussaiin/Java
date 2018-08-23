import java.util.Scanner;

class Ex5 {
  public static void main(String [] args){
    int n=1;
    System.out.println("* | 1  2  3  4  5  6  7  8  9 \n-----------------------------");
    for (int i=1; i<=9; i++){
      System.out.print(n+" | ");
      n++;
      for (int j=1; j<=9; j++) {
        System.out.print(i*j+" ");
      }
      System.out.println();
    }
  }
}
