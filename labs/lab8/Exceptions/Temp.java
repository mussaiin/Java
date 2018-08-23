import java.util.*;
import java.io.*;
import java.lang.*;

public class Temp{
  public static int divide(int a, int b) throws Exception{
    if(b==0) throw new ArithmeticException("b is 0");
    if(b==10) throw new DivideByTenException("b cannot be 10");
    return a/b;
  }
  public static void main(String [] args) throws Exception{
    Scanner in = new Scanner(System.in);
    System.out.println("Enter 2 numbers:");
    int a,b;
    while(true){
      try{
        a=in.nextInt();
        b=in.nextInt();
          System.out.println("a/b="+divide(a, b));
          break;
      }
      catch(ArithmeticException e){
        System.out.println(e.getMessage());
      }
      catch(InputMismatchException e){
        System.out.println("Error, enter the number:");
        in.nextLine();
      }
      catch(DivideByTenException e){
        System.out.println(e.getMessage());
        e.printStackTrace();
      }
      finally{
        System.out.println("finally");
      }
    }
    System.out.println("the end");
  }
}
