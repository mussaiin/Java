import java.util.*;
import java.io.*;
import java.lang.*;
import java.text.*;

public class Main{
  public static void main(String [] args){
    try{
      File fin = new File("input.txt");
      File fout = new File("output.txt");
      Scanner in = new Scanner(fin);
      PrintWriter pw = new PrintWriter(fout);

      int a = in.nextInt();
      int b = in.nextInt();
      pw.println(a+b);
      pw.close();
    }
    catch(Exception e){
      e.printStackTrace();
    }
  }
}
