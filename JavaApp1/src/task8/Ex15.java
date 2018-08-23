package task8;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.Scanner;

/**
 *
 * @author Nurlybek
 */
public class Ex15 {
    public static void main(String[] args) throws IOException {
      Scanner input = new Scanner(System.in);
      System.out.print("Enter the encrypted file name: ");
      String inFile = input.next();
      System.out.print("Enter the file name for the decrypted file: ");
      String outFile = input.next();
      try(RandomAccessFile encrypted = new RandomAccessFile(inFile, "r");
          RandomAccessFile decrypted = new RandomAccessFile(outFile, "rw");
	    ){
        int r;
        encrypted.seek(0);
        while ((r = encrypted.read()) != -1) {
	         decrypted.write(((byte)r) - 5);
        }
      }
    }
}
