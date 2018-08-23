package Contest1;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.util.*;

/**
 *
 * @author Nurlybek
 */
public class Taxi {
    public static void main(String[] args) {    
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();    
        int[]a = new int[n];
        int taxinum = 0;
        int t1=0, t2=0, t3=0, t4=0;
        for (int i = 0; i < n; i++) {
          a[i] = in.nextInt();
        }
        for (int i = 0; i < n; i++) {
            if (a[i] == 1)
              t1++;
            if (a[i] == 2)
              t2++;
            if (a[i] == 3)
              t3++;
            if (a[i] == 4)
              t4++;
         }
        taxinum = t4+t3+t2/2;
        if (t3<t1) {
            t1 -= t3;
            if (t2%2!=0){
		t1 += 2;
            }               
            taxinum += t1/4;			
            if (t1%4!=0){
		taxinum += 1;
            }
        }	
	else {
            if (t2%2!=0)
                taxinum += 1;
	}	
	System.out.print(taxinum);
    }
}