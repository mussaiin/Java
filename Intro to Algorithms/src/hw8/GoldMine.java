/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hw8;

/**
 *
 * @author Nurlybek
 */
public class GoldMine {
	public static void main(String [] args){
		int arr[][] = {
                                {1, 3, 4, 5},
                                {2, 2, 4, 1},
                                {5, 0, 2, 3},
                                {0, 6, 5, 2}};
		int right = 0, rightUp=0, rightDown = 0, max=0;
		for (int i = 0; i < arr.length; i++){
                    System.out.println(" ");
			for (int j = 1; j < arr[0].length; j++){
				right = arr[i][j-1];
				if ((i-1)>=0) {
                                    rightUp=arr[i-1][j-1];
                                }
				else if ((i+1)<=4) {
                                    rightDown = arr[i+1][j-1];
                                }
				arr[i][j] = arr[i][j]+ Math.max(Math.max(right, rightUp), rightDown);
                                System.out.print(arr[i][j]+" ");
			}
		}
		for (int i = 0; i < arr.length; i++){
			for (int j = 0;j<arr[0].length; j++){
				if (arr[i][j]>max) 
                                    max = arr[i][j];
			}
		}
                System.out.println("");
		System.out.println(max);
	}
}

