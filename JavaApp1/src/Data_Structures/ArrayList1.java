package Data_Structures;

import java.io.File;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class ArrayList1 {
    public static void main(String[] args) throws Exception{
        ArrayList<String> al = new ArrayList<>();
        Scanner in = new Scanner(new File(args[0]));
        while (in.hasNext()) {
            String next = in.next();
            al.add(next);
        }
        Collections.sort(al);
        System.out.println(al.toString());
    }
}
