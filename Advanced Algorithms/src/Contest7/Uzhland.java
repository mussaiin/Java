/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Contest7;

import java.util.Scanner;

/**
 *
 * @author Nurlybek
 */
public class Uzhland {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int arr [] = new int[n];
        long a [] = new long[n];
        for (int i = 0; i < n; i++) {
            arr[i] = in.nextInt();
        }

        a[n-1] = 0;
        a[n-2] = Math.abs(arr[n-2] - arr[n-1]);
        long max = a[n-2];
        for (int i = n-3; i >= 0; i--) {
            a[i] = Math.max(Math.abs(arr[i] - arr[i+1]), a[i+2] + Math.abs(arr[i] - arr[i+1]) - Math.abs(arr[i + 1] - arr[i+2]));
            max = Math.max(a[i], max);
        }
        System.out.println(max);
    }
}