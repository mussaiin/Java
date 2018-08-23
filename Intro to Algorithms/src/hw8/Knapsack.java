/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hw8;

import java.util.Scanner;

/**
 *
 * @author Nurlybek
 */
public class Knapsack {
    public static void main(String args[])
    {
                Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int w = in.nextInt();
		int [] ar = {5, 7, 9, 11, 13};
		int [][] a = new int[n][w];
		int max = 0;
		for (int i = 1; i < n; i++){
                    System.out.println("");
			for (int j = 0; j < w; j++){
				if((j-ar[i]) >= 0){
					a[i][j] = Math.max(a[i-1][j], a[i-1][j-ar[i]]+ar[i]);
				}
				else{
					a[i][j] = a[i-1][j];
				}
                                System.out.print(a[i][j]+" ");
			}
		}
		for (int i = 0; i < n; i++){
			for (int j = 0; j < w; j++){
				if (a[i][j] > max) 
                                    max=a[i][j];
			}
		}
                System.out.println("");
		System.out.println(max);
    }
}
