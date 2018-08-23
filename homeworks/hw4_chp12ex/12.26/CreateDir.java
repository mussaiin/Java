import java.util.*;
import java.io.*;
import java.lang.*;
import java.net.*;

class CreateDir{
  public static void main(String[] args) throws Exception{
    Scanner input = new Scanner(System.in);
	  System.out.print("Enter directory name: ");
		File dir = new File(input.next());
		if (dir.isDirectory()) {
			System.out.println("Directory already exists");
			System.exit(0);
		}
		if (dir.mkdirs()) {
			System.out.println("Directory created successfully");
		}
  }
}
