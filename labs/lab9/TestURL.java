import java.util.*;
import java.io.*;
import java.lang.*;

public class TestURL{
  public static void main(String [] args) throws Exception{
    URL url = new URL("https://github.com/dwyl/english-words/blob/master/words.txt");
    Scanner in = new Scanner(url);
    PrintWriter out = new PrintWriter(fi);
    while(in.hasNext()){
      out.println(in.nextLine());
    }
    out.close();
  }
}
