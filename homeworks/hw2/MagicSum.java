import java.util.*;

public class MagicSum {
    public String toString(int n){return ""+n;}
    public static boolean hasEight(int num){
      String s = Integer.toString(num);
      for(int i=0; i<s.length(); i++){
        if(s.charAt(i)=='8'){
          return true;
        }
        else{
          return false;
        }
      }
      return true;
    }
    public static void main(String [] args){
      int sum=0;
      while(true){
        System.out.println("Enter a positive integer or -1 to exit:");
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        if(hasEight(n)){
          sum=sum+n;
        }
        else if(n==-1){
          System.out.println("The magic sum is: "+sum);
          break;
        }
      }
    }
}
