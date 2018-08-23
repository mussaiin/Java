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
public class Kings {
    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);
        String s = in.nextLine();
        int count = 0;
        char s1 = s.charAt(0), s2 = s.charAt(1);
        if(s1 == 'a' || s1 == 'h'){
            count++;
        }
        if(s2 == '1' || s2 == '8')
        {
            count++;
        }
        if(count == 0){
            System.out.println("8");
        }
        else if(count == 1){
            System.out.println("5");
        }
        else if (count == 2) {
            System.out.println("3");
        }
        
    }
}
