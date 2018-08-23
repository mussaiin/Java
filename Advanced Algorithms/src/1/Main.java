import java.util.*;
import java.io.*;
import java.lang.*;
import java.text.*;

public class Main{
  public static void main(String [] args){
    Scanner sc = new Scanner(System.in);
      String[] time = sc.nextLine().split(":");
      String hours = time[0];
      String minutes = time[1];
      String seconds = time[2].substring(0,2);
      String dayEve = time[2].substring(2,4);
      if(dayEve.equals("AM")){
          System.out.println((hours.equals("12")?"00":hours) +":"+minutes+":"+seconds);
      }
      else{
          System.out.println((hours.equals("12")?hours:(Integer.parseInt(hours)+12))+":"+minutes+":"+seconds);
      }
  }
}
