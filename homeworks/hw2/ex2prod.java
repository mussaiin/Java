import java.util.Scanner;

class Ex2 {
  public static void main(String [] args){
    long num=1;
    for (int i=1; i<=13; i++) {
      num*=i;
    }
    System.out.print("The product from 1 to 13 is: " + num);
  }
}
