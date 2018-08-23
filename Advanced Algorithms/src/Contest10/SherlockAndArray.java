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
public class SherlockAndArray {
	public static void main(String[] args) {
            Scanner in = new Scanner(System.in);
            int N = in.nextInt();
            for(int i = 0; i < N ; i++){
                int n = in.nextInt();	
                int[] arr = new int[n];	
                for(int j = 0; j < n; j++){            
                    arr[j] = in.nextInt();		
                }	           
                System.out.println(solve(arr));
            }
	}

	private static String solve(int[] arr) {
            if(arr.length == 1){
            	return "YES";
            }
            int left = 0;
            int right = 0;
            for(int i = 0; i < arr.length; i++){
		right += arr[i];
            }
            for(int i = 0; i < arr.length; i++){	
                right -= arr[i];						
		if(left==right){
                    return "YES";
                }
		else if(left>right){
                    break;
		}
		left += arr[i];
		}
		return "NO";
	}
}
