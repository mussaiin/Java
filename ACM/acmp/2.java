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

      int n = in.nextInt();
      int sum=0;
      if(n>0){
        for (int i=1; i<=n; i++) {
          sum+=i;
        }
      }
      else{
        for (int i=1; i>=n; --i) {
          sum+=i;
        }
      }
      pw.println(sum);
      pw.close();
    }
    catch(Exception e){
      e.printStackTrace();
    }
  }
}
