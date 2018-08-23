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
public class EnergyExchange {
    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);
        
        double n = in.nextDouble();
        double k = in.nextDouble();
        k = 1-k/100;        
        int [] a = new int[(int) n];
        
        for (int i = 0; i < a.length; i++) {
            a[i] = in.nextInt();
        }
        double left = 0, right = 1000;
        for(int t = 0; t < 99; t++){
            double mid = (right + left)/2;
            double more = 0;
            double less = 0;
            for(int i = 0; i < a.length; i++){
                if(a[i]>=mid)
                    more += a[i] - mid;
                if(a[i]<mid)
                    less += mid - a[i];	
            }
            if(k * more >= less)
                left=mid;
            else 
                right=mid;
            //System.out.println(left+" "+mid+" "+right+" "+k*more+" "+less);	
        }	
        System.out.print(left);
    }
}
