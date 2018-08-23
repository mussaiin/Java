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
public class C765 {
    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);
        
        int k = in.nextInt();
        int a = in.nextInt();
        int b = in.nextInt();
        
        if ((a%k!=0 && b/k==0) || (b%k!=0 && a/k==0)) { System.out.println("-1"); } 
        else{ System.out.println(a/k+b/k); }
       
        //System.out.println(2/4);
        //System.out.println((double)11/2);
    }
}
