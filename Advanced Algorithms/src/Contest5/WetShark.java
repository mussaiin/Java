/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Contest5;

import java.util.Scanner;

/**
 *
 * @author Nurlybek
 */
public class WetShark {
    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);
        
        int n = in.nextInt();        
        int [] a = new int[3001];        
        int [] x = new int[200001];        
        int [] y = new int[200001];        
        
        for (int i = 0; i < n; i++) {        
            x[i] = in.nextInt();            
            y[i] = in.nextInt();            
        }        
        
        long ans = 0;        
        
        for (int i = 0; i < n; i++) {        
            ans += a[x[i] - y[i] + 1000];            
            a[x[i] - y[i] + 1000]++;            
        }        
        
        a = new int[3001];        
        
        for (int i = 0; i < n; i++) {        
            ans += a[x[i] + y[i] + 1000];            
            a[x[i] + y[i] + 1000]++;            
        }        
        
        System.out.println(ans);
    }    
}
