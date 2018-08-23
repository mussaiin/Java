import java.util.*;
import java.io.*;
import java.lang.*;

public class Test{
  public static void main(String [] args) throws Exception{
    File file = new File("D:\\Education\\IT\\Java\\labs\\lab9\\lab1.txt");
    File fi = new File("D:\\Education\\IT\\Java\\labs\\lab9\\lab2.txt");
    Scanner in = new Scanner(file);
    PrintWriter out = new PrintWriter(fi);
    while(in.hasNext()){
      out.println(in.nextLine());
    }
    out.close();
    // System.out.println("Exists:"+file.exists());
    // System.out.println("Size:"+file.length()+"bytes");
    // System.out.println("Can Read?"+file.canRead());
    // System.out.println("Can Write?"+file.canWrite());
    // System.out.println("is Folder?"+file.isDirectory());
    // System.out.println("is File?"+file.isFile());
    // System.out.println("is Hidden?"+file.isHidden());
    // System.out.println("abs path: "+file.getAbsolutePath());
    // System.out.println("last modified: "+new Date(file.lastModified()));
    //  file.renameTo(new File("D:\\Education\\IT\\Java\\labs\\lab9\\lab1.txt"));

  }
}
