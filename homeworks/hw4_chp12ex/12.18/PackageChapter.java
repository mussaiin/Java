import java.util.*;
import java.io.*;
import java.lang.*;

public class PackageChapter {
  public static void main(String[] args) {
    File file = new File(args[0]);
    try {
      Scanner input = new Scanner(file);
    }
    catch (Exception ex) {
      System.out.println("It doesn't exist.");
      ex.printStackTrace();
    }
  }
}
