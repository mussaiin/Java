/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Contest9;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author Nurlybek
 */
public class ArithmeticProgression {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
	int n = in.nextInt();
        int[] arr = new int[n];
	for (int i = 0; i < n; i++)
            arr[i] = in.nextInt();
	Arrays.sort(arr);
	if (n == 1)
            System.out.println(-1);
	else if (n == 2) {
            if ((arr[0] - arr[1]) % 2 == 0) {
		if (arr[0] == arr[1]) {
                    System.out.println(1);
                    System.out.println(arr[0]);
                } else {
                    System.out.println(3);
                    System.out.printf((2*arr[0]-arr[1])+" "+((arr[0]+arr[1])/2)+" "+(2*arr[1]-arr[0]));
                }
            } else {
		System.out.println(2);
		System.out.printf((2*arr[0]-arr[1])+" "+(2*arr[1]-arr[0]));
            }
        } else {
            int d1 = arr[1] - arr[0];
            int d2 = -1;
            int f1 = 0;
            int f2 = 0;
            for (int i = 1; i < n; i++) {
                if (arr[i] - arr[i - 1] == d1){
                    f1++;
                }
		else if (d2 == -1) {
                    d2 = arr[i] - arr[i - 1];
                    f2++;
		} else if (arr[i] - arr[i - 1] == d2){
                    f2++;
                }
		else {
                    System.out.println(0);
                    return;
		}		
            }
		
            if (f2 == 0 || f1 == 0) {
                if (d1 == 0 || d2 == 0) {					
                    System.out.println(1);
                    System.out.println(arr[0]);
		} else {
                    System.out.println(2);
                    System.out.printf((2*arr[0]-arr[1])+" "+(2*arr[n-1]-arr[n-2]));
                }
            } 
            else if ((f1 == 1 && d2 == (double) d1 / 2) || (f2 == 1 && d1 == (double) d2 / 2)) {
                int x = -1;
		int y = -1;
		for (int i = 1; i < n; i++) {
                    if (arr[i] - arr[i - 1] == ((f1 == 1 && d2 == (double) d1 / 2)? d1 : d2)) {
			x = arr[i];
			y = arr[i - 1];
                    }
		}
		System.out.println(1);
		System.out.println((x+y)/2);
		} 
            else
                System.out.println(0);
	}
    }
}
