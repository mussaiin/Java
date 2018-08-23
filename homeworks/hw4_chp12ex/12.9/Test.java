import java.util.*;
import java.io.*;
import java.lang.*;

public class Test {
  public static boolean isBinary(String bin) {
    for (char ch : bin.toCharArray()) {
      if (ch != '1' && ch != '0') return false;
    }
    return true;
  }
  public static int bin2Dec(String binary) throws BinaryFormatException {
    if (!isBinary(binary)) {
      throw new BinaryFormatException("It is not a binary number.");
    }
    int n = 0;
    int decimal = 0;
    for (int i = binary.length() - 1; i >= 0; i--) {
      if (binary.charAt(i) == '1') {
        decimal += Math.pow(2, n);
      }
      n++;
    }
    return decimal;
  }
  public static void main(String [] args) {
    try{
      System.out.println(bin2Dec("1100100"));
      System.out.println(bin2Dec("lafkja"));
    }
    catch(BinaryFormatException e){
      e.printStackTrace();
    }
  }
}
