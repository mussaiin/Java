/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Week5lab;

import java.util.Scanner;

/**
 *
 * @author Nurlybek
 */
public class A560 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int [] a = new int[1001];
        for (int i = 0; i < n; i++) {
            a[i] = in.nextInt();
            if(a[i]==1){
                System.out.println("-1");
                return;
            }
        }
        System.out.println("1");
       
    }
}
