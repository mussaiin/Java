import java.util.*;
import java.io.*;
import java.lang.*;

public class Temp2{
  public static void main(String [] args) throws Exception{
    Scanner in = new Scanner();
    String text = "";
    while(in.hasNext()){
      text+= in.nextLine().replaceAll(("\n"+"{"), "")+"\n";
    }
    in.close();
    PrintWriter out = new PrintWriter(new File(args[1]));
    out.println(text);
    out.close();
  }
}
