import java.util.*;
import java.io.*;
import java.lang.*;

public class ReformateCode {
  public static void main(String[] args) {
    File file = new File(args[0]);
    StringBuilder buffer = new StringBuilder();
    try {
      Scanner in = new Scanner(file);
      while (in.hasNext()) {
        String s = in.nextLine();
        if (s.contains("{")) {
          buffer.append(" {");
        }
        else {
            buffer.append("\n" + s );
        }
      }
      PrintWriter pw = new PrintWriter(file);
      pw.write(buffer.toString());
      pw.close();
    }
    catch (FileNotFoundException e) {
      System.out.println("It doesn't exist.");
      e.printStackTrace();
    }
  }
}
