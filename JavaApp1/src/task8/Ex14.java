package task8;
import java.util.Scanner;
import java.io.*;

class Ex14 {
  public static void main(String[] args) throws IOException {
    Scanner in = new Scanner(System.in);
    System.out.print("Enter input file name: ");
    String inFile = in.next();
    System.out.print("Enter output flie name: ");
    String outFile = in.next();
    try(RandomAccessFile source = new RandomAccessFile(inFile, "r");
        RandomAccessFile target = new RandomAccessFile(outFile, "rw");
	  ){
            int r = 0;
            source.seek(0);
            while ((r = source.read()) != -1) {
              target.write(((byte)r) + 5);
            }
            target.close();
        }
        catch(Exception e){
            e.printStackTrace();
        }
    }
}
