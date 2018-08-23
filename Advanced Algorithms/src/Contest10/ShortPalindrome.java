/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Contest10;

import java.util.Scanner;

/**
 *
 * @author Nurlybek
 */
public class ShortPalindrome {
    public static void main(String[] args) {
        final int MOD = (int) Math.pow(10, 9)+7;	
        Scanner in = new Scanner(System.in);	
        String s = in.next();
        char[] chars = s.toCharArray();
        int[] seen = new int[26];
        int[][] pairs = new int[26][26];
        int[][] trips = new int[26][26];
        int[][] quads = new int[26][26];

        for (char c : chars) {	
            int pos = c - 'a';
            for (int i = 0; i < 26; i++) {             
                quads[pos][i] += trips[c - 'a'][i];		
                quads[pos][i] %= MOD;		
                trips[i][pos] += pairs[i][pos];		
                trips[i][pos] %= MOD;		
                pairs[i][c - 'a'] += seen[i];		
                pairs[i][c - 'a'] %= MOD;		
            }	
            seen[c - 'a']++;	
        }	
        int sum = 0;	
        for (int i = 0; i < 26; i++) {	
            for (int j = 0; j < 26; j++) {	
                sum += quads[i][j];		
                sum %= MOD;		
            }	
        }	
        System.out.println(sum);   	
    }
}
