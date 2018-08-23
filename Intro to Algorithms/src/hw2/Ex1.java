/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hw2;

import java.util.Arrays;
import java.util.Scanner;

/**   
 *
 * @author Nurlybek
 */

public class Ex1 { 
    public static void main(String [] args){ 
        int count = 0; 
        Scanner in=new Scanner(System.in); 
        int a = in.nextInt(); 
        
        int [] check = new int[a*a]; 
        for(int i = 0; i < a*a; i++){ 
            check[i] = i+1; 
        }
        int[][] c = new int[a*a][a*a]; 
        
        for(int i = 0; i < a*a ; i++){ 
            int []e = new int[a*a]; 
            for(int j = 0; j < a*a; j++){ 
                int b = in.nextInt(); 
                c[i][j] = b; 
                e[j] = b; 
            } 
            Arrays.sort(e); 
            if(Arrays.equals(e, check)) 
                e = new int[a*a]; 
            else{ 
                count++; 
            } 
        } 
        for(int i = 0; i < a*a; i++){ 
        int [] f = new int[a*a]; 
            for(int j = 0; j < a*a; j++){ 
                f[j] = c[j][i]; 
                } 
            Arrays.sort(f); 
            if(Arrays.equals(f, check)) 
                f = new int[a*a]; 
            else{ 
                count++; 
            } 
        } 
        for(int l = 0; l < a; l++){ 
            for(int i = 0; i < a; i++){ 
                int [] h = new int[a*a]; 
                for(int j = 0; j < a; j++){ 
                    for(int k = 0; k < a; k++){ 
                        h[k+j*a] = c[j+i*a][k+l*a]; 
                    } 
                } 
                Arrays.sort(h); 
                if(Arrays.equals(h, check)) 
                    h = new int[a*a]; 
                else{ 
                    count++; 
                } 
            } 
        } 
        if(count > 0) 
            System.out.println("Incorrect"); 
        else 
            System.out.println("Correct"); 
        } 
}

/*
3
1 3 2 5 4 6 9 8 7 
4 6 5 8 7 9 3 2 1 
7 9 8 2 1 3 6 5 4 
9 2 1 4 3 5 8 7 6 
3 5 4 7 6 8 2 1 9 
6 8 7 1 9 2 5 4 3
5 7 6 9 8 1 4 3 2 
2 4 3 6 5 7 1 9 8 
8 1 9 3 2 4 7 6 5
*/