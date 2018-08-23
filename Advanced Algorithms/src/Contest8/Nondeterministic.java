/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Contest8;

import java.util.Scanner;

/**
 *
 * @author Nurlybek
 */
public class Nondeterministic {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        String[] firstNames = new String[n + 1];        
        String[] lastNames = new String[n + 1];            
        for (int i = 1; i <= n; i++) {        
            firstNames[i] = in.next();            
            lastNames[i] = in.next();            
        }
                
        String curr;        
        int index = in.nextInt();
                
        if (firstNames[index].compareTo(lastNames[index]) < 0) {        
            curr = firstNames[index];            
        } else {        
            curr = lastNames[index];            
        }        
                
        for (int i = 1; i < n; i++) {        
            index = in.nextInt();
                                  
            String first = firstNames[index];            
            String last = lastNames[index];
                        
            if (curr.compareTo(first) > 0) {            
                if (first.compareTo(last) < 0 || last.compareTo(curr) < 0) {                
                    curr = first;                    
                } else {                
                    curr = last;                   
                }                
            } else if (curr.compareTo(last) < 0) {            
                curr = last;                
            } else {            
                System.out.println("NO");                
                return;                
            }       
        }               
        System.out.println("YES");
    }
}
