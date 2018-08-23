/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Contest9;

import java.util.Scanner;

/**
 *
 * @author Nurlybek
 */
public class PowerOfTwo {
    
    public static boolean powerOfTwo(int n){
        if (n==0) {
            return false;
        }
        while(n!=1){
            if (n%2!=0) {
                return false;
            }
            n/=2;
        }
        return true;
    }
    
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] a = new int[n];
        int ans = 0;
        for (int i = 0; i < n; i++) {
            a[i] = in.nextInt();
        }
        for (int i = 0; i < a.length; i++) {
            for (int j = i+1; j < a.length; j++) {
                if(powerOfTwo(a[i]+a[j])){
                    ans+=1;
                }
                //System.out.println(ans+" "+a[i]+" "+a[j]);
            }
        }
        System.out.println(ans);
    }
}
