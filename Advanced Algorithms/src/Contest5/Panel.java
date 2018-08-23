/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Contest5;

import java.util.Scanner;

/**
 *
 * @author Nurlybek
 */
public class Panel {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int k = in.nextInt();
        int [] time = new int[17];
        for (int i = 0; i < 4; i++) {
            String s = in.next();
            char [] chars = s.toCharArray();
            for (char c : chars) {
                if(c!='.'){time[c-'0']++;}               
            }
        }
        for (int i = 0; i < 16; i++) {
            if(time[i]>2*k){
                System.out.println("NO");
                return;
            }            
        }
        System.out.println("YES");
    }
}
