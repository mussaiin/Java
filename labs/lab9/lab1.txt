import java.util.*;
import java.io.*;
import java.lang.*;

public class Temp
{
  public static void main(String [] args) throws Exception
  {
    Scanner in = new Scanner(new File(args[1]));
    String text = "";
    while(in.hasNext())
    {
      text+= in.nextLine().replaceAll(args[0], "")+"\n";
    }
    in.close();
    PrintWriter out = new PrintWriter(new File(args[1]));
    out.println(text);
    out.close();
  }
}
