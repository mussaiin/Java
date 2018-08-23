/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Contest7;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author Nurlybek
 */
public class MahmudMessage {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        char [] str = in.next().toCharArray();
        int [] chars = new int[26];
        for(int i = 0; i < 26; ++i) {
            chars[i] = in.nextInt();
        }
        int [] a = new int[n+1];
        a[0] = 1;
        int[] aLength = new int[n + 1];
        Arrays.fill(aLength, Integer.MAX_VALUE);
        aLength[0] = 0;
        int maxLength  = 0;
        int mod = (int) Math.pow(10, 9) + 7;
        for(int i = 1; i <= n; ++i) {
            int f = 0;
            for(int j = i - 1; j >= 0; --j) {
                f = Math.max(f, i - chars[str[j] - 'a']);
                if(f > j) continue;
                a[i] = (a[i] + a[j]) % mod;
                aLength[i] = Math.min(aLength[i], aLength[j] + 1);
                maxLength = Math.max(maxLength, i - j);
            }
        }
        System.out.println(a[n] + "\n" + maxLength + "\n" + aLength[n]);
    }
   
}
