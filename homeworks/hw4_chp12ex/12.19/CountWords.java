import java.util.*;
import java.io.*;
import java.lang.*;
import java.net.*;

public class CountWords{
  public static void main(String[] args) throws Exception{
    try {
      URL url = new URL("http://cs.armstrong.edu/liang/data/Lincoln.txt");
      int count = 0;
			Scanner in = new Scanner(url.openStream());
			while (in.hasNext()) {
				if (Character.isLetter((in.next()).charAt(0))) {
					count++;
				}
			}
			System.out.println("Words = "+count);
		}
		catch (Exception e) {
      e.printStackTrace();
		}
  }
}
