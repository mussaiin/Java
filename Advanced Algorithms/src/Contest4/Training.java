/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Contest4;

import java.util.Scanner;

/**
 *
 * @author Nurlybek
 */
public class Training {
    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);
        
        int n = in.nextInt(); 
        int k = in.nextInt();
        
        int [] rangs = new int[n+1];
        
        int sum = 0;
        
        for (int i = 0; i < n; i++) {
            rangs[i] = in.nextInt();
            sum += rangs[i];
        }
        rangs[n] = k;
        int res = 0;
        
        while(sum < k * n) {
            for(int i = 0 ; i < n; i++) {
                //System.out.print(rangs[i] + " ");
                if(rangs[i] < rangs[i+1]) {
                    rangs[i]++;
                    sum++;
		}
            }
            
            res++;
	}
	System.out.println(res);
    }
}
