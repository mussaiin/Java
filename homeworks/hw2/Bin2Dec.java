import java.util.Scanner;

public class Bin2Dec {
    public static int Bin2Dec(int n){
      if(n>10){
        return ""+n%10+Bin2Dec(n/10)*2;
      }
      else if(n==0){return 0;}
      else{
        return 1;
      }
    }
    public static void main(String [] args){
      Scanner in = new Scanner(System.in);
      int a = in.nextInt();
      System.out.println(Bin2Dec(a));
    }
}
