import java.util.Scanner;

class Ex4 {
  public static void main(String [] args){
    long num=0;
    for (int i=1; i<=10; i++) {
      for(int j=1; j<=11; j++){
        num++;
        if(num%3==0){
          System.out.print("Coza ");
        }
        else if(num%5==0){
          System.out.print("Loza ");
        }
        else if(num%7==0){
          System.out.print("Woza ");
        }
        else if(num%3==0 && num%5==0){
          System.out.print("CozaLoza ");
        }
        else{
          System.out.print(num + " ");
        }
      }
      System.out.println();
    }
  }
}
