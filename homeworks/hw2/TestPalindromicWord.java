//TestPalindromicWord
import java.util.*;
public class TestPalindromicWord {
    public String toString(int n){return ""+n;}
    public static void main(String [] args){
      Scanner scan = new Scanner(System.in);
      String s = scan.nextLine();
      s=s.toLowerCase();
      String newS="";
      String newS2="";
      for(int i=0; i<s.length(); i++){
        char c = s.charAt(i);
        if(Character.isLetter(c)){
          newS=newS+s.charAt(i);
        }
      }
      for (int i=s.length()-1; i>=0; i--){
        char c = s.charAt(i);
        if(Character.isLetter(c)){
          newS2=newS2+s.charAt(i);
        }
      }
      int count=0;
      for (int i=0; i<newS.length(); i++){
        if(newS.charAt(i)==newS2.charAt(i)){
            count++;
        }
        else{
          System.out.print("not Palindrome");
          break;
        }
      }
      if(count==newS2.length()){
        System.out.print("Palindrome");
      }
    }
}
