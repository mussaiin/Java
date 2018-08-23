/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Contest8;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;

/**
 *
 * @author Nurlybek
 */
public class StringConcat {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);        
        ArrayList<String> stringArrayList = new ArrayList<>();

        int n;

        n = Integer.parseInt(in.next());
        for (int i = 0; i < n; i++) {
            String temp;
            temp = in.next();
            stringArrayList.add(temp);
        }


        stringArrayList.sort(new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return (o1 + o2).compareTo(o2 + o1);
            }
        });

        
        String result = "";

        for (int i = 0; i < n; i++) {
            result += stringArrayList.get(i);
        }


        System.out.println(result);
    }
}
