/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Week4lab;

import java.util.Scanner;

/**
 *
 * @author Nurlybek
 */
public class B474 {    
    
    public static int search(int val, int[] arr) {
        return search(val, arr, 0, arr.length-1);
    }
    
    private static int search(int val, int[] arr, int left, int right) {
        if (left > right) return -1;
        
        int mid = left + (right - left) / 2;
        
        if (val < arr[mid]) {
            return search(val, arr, left, mid - 1);
        } else if (val > arr[mid]) {
            return search(val, arr, mid + 1, right);
        } else {
            return mid;
        }
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int sum = 0;
        int [] ans;
        int n = in.nextInt();
        int [] a = new int[n];
        
        for (int i = 0; i < n; i++) {
            int b = in.nextInt();
            sum += b;
            a[i] = sum;
        }
        
        int m = in.nextInt();
        
        for (int i = 0; i < m; i++) {
            int b = in.nextInt();
            System.out.println(search(b, a)+1+" ");
        }
    }
}