import java.util.*;

public class Arithmetic {
  public static void main(String [] args){
    int sum=0, mult=0, div=0, sub=0;
    sum = Integer.parseInt(args[0])+Integer.parseInt(args[1]);
    mult = Integer.parseInt(args[0])*Integer.parseInt(args[1]);
    sub = Integer.parseInt(args[0])-Integer.parseInt(args[1]);
    div = Integer.parseInt(args[0])/Integer.parseInt(args[1]);
    if(args[2].charAt(0)=='+'){System.out.print(args[0]+"+"+args[1]+"="+sum);}
    else if(args[2].charAt(0)=='-'){System.out.print(args[0]+"-"+args[1]+"="+sub);}
    else if(args[2].charAt(0)=='*'){System.out.print(args[0]+"*"+args[1]+"="+mult);}
    else if(args[2].charAt(0)=='/'){System.out.print(args[0]+"/"+args[1]+"="+div);}
    System.out.print("\n"+args[0]+" "+args[1]+" "+args[2]);
  }
}
