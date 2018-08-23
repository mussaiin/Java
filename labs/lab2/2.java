import java.util.Scanner;

class Mark {
	public static void main(String [] args){
    Scanner in = new Scanner(System.in);
    String s = in.nextLine();
    String vowels="aeiou";
    String nums="1234567890";
    int vow = 0, num = 0, vowprc, numprc;
    for(int i=0; i<s.length(); i++){
      for(int j=0; j<vowels.length(); j++){
        if(s.charAt(i)==vowels.charAt(j)){
          vow++;
        }
      }
      for (int j=0; j<nums.length(); j++){
        if(s.charAt(i)==nums.charAt(j)){
          num++;
        }
      }
    }
    vowprc = (vow*100)/s.length();
    numprc = (num*100)/s.length();
    System.out.println("Vowels: "+vow+" Percentage: "+vowprc);
    System.out.println("Nums: "+num+" Percentage: "+numprc);

    /*
    int grade = in.nextInt();
    in.nextLine();
    System.out.print("Enter your name: ");
    String name = in.nextLine();
    char mark;
    if(grade>=90){mark='A';}
    else if(grade>=75){mark='B';}
    else if(grade>=60){mark='C';}
    else if(grade>=50){mark='D';}
    else if(grade<49){mark='F';}
    System.out.println(name+", your mark is "+mark);
    */
  }
}
