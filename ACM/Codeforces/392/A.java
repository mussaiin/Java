import java.util.*;
import java.io.*;
import java.lang.*;
import java.text.*;

public class Main{
    public static void main(String [] args){
      //try{
        //File fin = new File("input.txt");
        //File fout = new File("output.txt");
        Scanner in = new Scanner(System.in);
        //PrintWriter pw = new PrintWriter(System.out);
        int n = in.nextInt();
        int comp = 0;
        int[] na = new int[n];
        for(int i=0; i<n; i++){
          int a = in.nextInt();
          na[i] = a;
        }

        Arrays.sort(na);
        int mx = na[na.length-1];
        int count = 0;
        for(int i : na){
          count += (mx-i);
          //pw.print(i+" ");
        }
        System.out.print(""+count);
        //pw.close();
      /*}
      catch(Exception e){
        e.printStackTrace();
      }*/
    }
}
