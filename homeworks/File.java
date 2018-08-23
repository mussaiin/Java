import java.util.*;
import java.io.*;
import java.lang.*;

public class File {
  public static void main(String [] args) {
    try {
      Scanner in = new Scanner();
      System.out.print("Enter the name of file: ");
      String filename = in.nextLine();
      System.out.print("Enter the word you want to change: ");
      String word1 = in.nextLine();
      System.out.print("Enter the word that must change previous word: ");
      String word2 = in.nextLine();
      System.out.print("Name of new file:");
      String newfile = in.nextLine();
      Scanner infile = new Scanner(file);
      File file = new File(filename);

      StringBuilder buffer = new StringBuilder();
      while (infile.hasNext()) {
        String s = infile.nextLine();
        if (s.contains(word1)) {
          buffer.append(word2);
        }
      }
      File fi = new File(filename+".txt");
      PrintWriter pw = new PrintWriter(fi);
      pw.write(buffer.toString());
      pw.close();
    }
    catch (FileNotFoundException e) {
      System.out.println("It doesn't exist.");
      e.printStackTrace();
    }
  }
}
