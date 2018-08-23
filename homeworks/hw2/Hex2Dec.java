import java.util.*;

public class Hex2Dec{
  public static int Hex2Dec(String s) {
          String digits = "0123456789ABCDEF";
          s = s.toUpperCase();
          int result = 0;
          for (int i = 0; i < s.length(); i++) {
              char c = s.charAt(i);
              int d = digits.indexOf(c);
              result = result*16 + d;
          }
          return result;
      }
    public static void main(String [] args){
      Scanner scan = new Scanner(System.in);
      String hex = scan.nextLine();
      System.out.print(Hex2Dec(hex));
    }
}
