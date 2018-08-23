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
public class PetyaAulbay {
    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int [] a = new int[n];
        
        for (int i = 0; i < n; i++) {
            a[i] = in.nextInt();
        }
        
        int max = 0;		
	for(int i = 0; i < n; i++){		
            int temp = a[i];
            int count = 0;
            
            for(int j = i; j < n; j++){
		if(temp < a[j]) break;
		else {
                    count++;					
                    temp = a[j];				
                }			
            }			
            
            temp = a[i];	
            
            for(int j = i; j >= 0; j--){	
                if(temp<a[j]) break;		
                else {		
                    count++;		
                    temp = a[j];	
                }		
            }	
            
            count--;	
            if(count>max) 
                max = count;	
        }	
        System.out.println(max);
    }    
}
