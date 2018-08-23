import java.util.*;
import java.io.*;
import java.lang.*;

public class CharCount {
  public static void main(String[] args) {
    File file = new File(args[0]);
    int chars = 0, wrd = 0, line = 0;
    try {
      Scanner input = new Scanner(file);
      while (input.hasNext()) {
        String s = input.nextLine();
        line++;
        chars += s.length();
        String[] split = s.split(" ");
        for (String word : split) {
          wrd++;
        }
      }
    }
    catch (FileNotFoundException ex) {
      System.out.println("It doesn't exist.");
      ex.printStackTrace();
    }
    System.out.println("Characters: " + chars);
    System.out.println("Words: " + wrd);
    System.out.println("Lines: " + line);
  }
}
