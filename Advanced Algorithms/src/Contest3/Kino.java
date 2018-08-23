/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Contest3;

import java.util.Scanner;

/**
 *
 * @author Nurlybek
 */
public class Kino {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int n25 = 0, n50 = 0;       
        boolean c = true;
        
        for (int i = 0; i < n; i++) {
            
            int a = in.nextInt();
            
            if (a == 25) {
                n25++; 
            } 
            else if(a == 50){
                if (n25 <= 0) {
                    System.out.println("NO");
                    c = false;
                    break;
                }
                else{
                    n50++; n25--;
                }
            }
            else if(a == 100){
                if (n50>0 && n25>0) {
                    n25--; n50--;
                }
                else{
                    if (n25>=3) {
                        n25-=3;
                    }
                    else{
                        System.out.println("NO");
                        c = false;
                        break;
                    }
                }
            }
        }
        
        if (c) {
            System.out.println("YES");
        } 
    }
}
