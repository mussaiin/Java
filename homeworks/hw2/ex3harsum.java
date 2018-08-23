import java.util.Scanner;

class Ex3 {
  public static void main(String [] args){
    double num=0;
    for (double i=1; i<=4; i++){
      num=num+(1/i);
    }
    System.out.print("The product from 1 to 1/50000 is: " + num);
  }
}
