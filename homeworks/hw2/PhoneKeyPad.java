import java.util.Scanner;

public class PhoneKeyPad {
  public static int KeyPad(char c) {
    switch (Character.toUpperCase(c)) {
        case '0':
            return 0;
        case '1':
            return 1;
        case '2': case 'A': case 'B': case 'C':
            return 2;
        case '3': case 'D': case 'E': case 'F':
            return 3;
        case '4': case 'G': case 'H': case 'I':
            return 4;
        case '5': case 'J': case 'K': case 'L':
            return 5;
        case '6': case 'M': case 'N': case 'O':
            return 6;
        case '7': case 'P': case 'Q': case 'R': case 'S':
            return 7;
        case '8': case 'T': case 'U': case 'V':
            return 8;
        case '9': case 'W': case 'X': case 'Y': case 'Z':
            return 9;
    }
    return -1;
  }
  public static void main(String[] args) {
  Scanner in = new Scanner(System.in);

  System.out.print("Enter a string to convert in phone keypad: ");
  String stringVal = in.nextLine();

  for (int i = 0; i < stringVal.length(); i++) {
    if (Character.isLetter(stringVal.charAt(i))){
      System.out.print(KeyPad(Character.toUpperCase(stringVal.charAt(i))));
    }
    else{
      System.out.print(stringVal.charAt(i));
    }
   }
}
}
