/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package task8;
import java.io.*;
/**
 *
 * @author Nurlybek
 */
public class Ex12 {
    public static void main(String[] args) throws Exception {
        File[] splitFiles = new File[args.length - 1];

        for (int i = 0; i < splitFiles.length; i++) {
            splitFiles[i] = new File(args[i]);
            if (!splitFiles[i].isFile()) {
                throw new FileNotFoundException(splitFiles[i].getAbsolutePath() + " file not found.");
            }
        }

        File targetFile = new File(args[args.length - 1]);

        try (BufferedOutputStream out = new BufferedOutputStream(new FileOutputStream(targetFile))) {
            int buffer;
            for (File f : splitFiles) {
                try (BufferedInputStream in = new BufferedInputStream(new FileInputStream(f))) {
                    while ((buffer = in.read()) != -1)
                        out.write(buffer);
                }
            }
        }
    }
}
