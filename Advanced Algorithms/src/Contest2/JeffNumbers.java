/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Contest2;

import java.util.Scanner;

/**
 *
 * @author Nurlybek
 */
public class JeffNumbers {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        String output = "";
        int count0 = 0, count5 = 0;
        for (int i = 0; i < n; i++) {
            int a = in.nextInt();
            if(a==0){
                count0++; 
            }
            else if (a==5) {
                count5++;
            }
        }
        if (count5 > 9 && count0 >= 1){
            
        }
    }
}
   

