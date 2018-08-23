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
public class Browser {
    
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int n = in.nextInt();
        int pos = in.nextInt();
        int l = in.nextInt();
        int r = in.nextInt();

        int s = 0;
        
        if(n-r > 0 && l-1> 0){
            s = (r-l) + Math.min(Math.abs(pos-l), Math.abs(pos-r)) + 2;
        } else if(l==1 && r==n){
            s = 0;
        } else if(n - r > 0){
            s = Math.abs(r - pos) + 1;
        } else if(l - 1 > 0){
            s = Math.abs(pos -l) + 1;
        }
        
        System.out.println(s);
    }
}
