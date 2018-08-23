/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Contest3;

import java.util.Scanner;

/**
 *
 * @author Nurlybek
 */
public class Pirozhok {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        String s = in.nextLine();
        int [] c = new int[26];
        int ans = 0;
        for (int i = 0; i < s.length(); i++) {            
            
            if('A'<=s.charAt(i) && 'Z'>=s.charAt(i)){                
                
                if(c[s.charAt(i)-'A'] == 0){
                    ans++;
                }
                
                else{
                    c[s.charAt(i)-'A']--;
                }
            
            }
            
            if ('a' <= s.charAt(i) && 'z' >= s.charAt(i)) {
                c[s.charAt(i)-'a']++;
                //System.out.println(c[i]);
            }
            
        }
        System.out.println(ans);
//        System.out.println(Character.toChars(97+25));
//        System.out.println(Character.toChars('a'-32));
    }
}
