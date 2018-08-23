/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hw7;

/**
 *
 * @author Nurlybek
 */
public class LargeRec {
        static int sumOfArray(int[][] arr, int r, int c){
		int sum = 0;
		for (int i = 0; i <= r; i++){
			for (int j = 0; j <= c; j++){
				sum += arr[i][j];
			}
		}
		return sum;
	}
        public static void main (String [] args){
		int [][] a = {
				{300, 100, -200},
				{1, 2, 3},
				{-8, -8, -8},
                                {45, 45, 45}
		};
		int [][] b = new int [a.length][a[0].length];
		int max = 0, col = 0,row = 0;
		for (int i = 0; i < a.length; i++){
			for (int j = 0; j < a[0].length; j++){
				b[i][j] = sumOfArray(a, i, j);
				System.out.println(b[i][j] + " " + i + " " + j);
				if (b[i][j] > max) {
					max = b[i][j];
					row = i;
					col = j;
				}
			}
		}
		for (int i = 0; i <= row; i++){
			for (int j = 0;j <= col; j++){
				System.out.print(a[i][j]+" ");
			}
			System.out.println();
		}
	}
	
}