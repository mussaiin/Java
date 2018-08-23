/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Contest11;

import java.util.Scanner;

/**
 *
 * @author Nurlybek
 */
public class ScherlockValidString {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String str = in.next();
        
        int[] letters = new int[26];
        for (int i = 0; i < str.length(); i++) {
            letters[str.charAt(i) - 'a']++;
        }
        if (areEqual(letters, letters[str.charAt(0) - 'a'])) {
            System.out.println("YES");
            return;
        }
        int base = letters[str.charAt(0) - 'a'];
        for (int i = 0; i < letters.length; i++) {
            if (letters[i] != 0) {
                letters[i]--;
                if (areEqual(letters, letters[str.charAt(0) - 'a'])) {
                    System.out.println("YES");
                    return;
                }
                letters[i]++;
            }
        }
        System.out.println("NO");
    }
    
    private static boolean areEqual(int[] letters, int base) {
        for (int i = 0; i < letters.length; i++) {
            if (letters[i] != 0 && letters[i] != base) {
                return false;
            }
        }
        return true;
    }
}
