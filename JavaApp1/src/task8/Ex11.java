package task8;

import java.io.*;
public class Ex11{
  public static void main(String[] args) throws Exception {
      File file = new File(args[0]);

      if (!file.exists())
          throw new IOException("File does not exist");

      int divisions = Integer.parseInt(args[1]);
      long limit = file.length() / divisions + 1;

      try (BufferedInputStream in = new BufferedInputStream(new FileInputStream(file))) {

          for (int i = 1; i <= divisions; i++) {
              int current = 0;

              try (BufferedOutputStream out =
                           new BufferedOutputStream(new FileOutputStream(new File(args[0] + "." + i)))) {

                  int buffer;
                  while(current++ < limit && (buffer = in.read()) != -1) {
                      out.write(buffer);
                  }
              }
            }
      }
    }
}
