/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Contest8;

import java.util.Scanner;

/**
 *
 * @author Nurlybek
 */
public class VasyaString {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int k = in.nextInt();
        String s = in.next();
        int a=0, b=0, x=0, ans=0;		
	for(int i = 0; i < n; i++) {
            if(s.charAt(i)=='a') {
		a++;
            }
            else {
		b++;
            }
            if(Math.min(a, b) > k) {
		if(s.charAt(x)=='a') {
                    a--;
		}
		else {
                    b--;
		}
		x++;
            }
            else {
		ans = Math.max(ans, a+b);
            }
	}
		
	System.out.println(ans);
    }
}
