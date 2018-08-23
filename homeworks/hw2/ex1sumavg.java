import java.util.Scanner;

class Ex1 {
  public static void main(String [] args){
    int num=0;
    for (int i=1; i<=100; i++) {
      num+=i;
    }
    double avg=num/100;
    System.out.print("The sum is: "+ num +"\nThe average is: " + avg);
  }
}
