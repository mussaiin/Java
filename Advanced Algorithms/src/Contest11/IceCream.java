/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Contest11;

import java.util.Scanner;

/**
 *
 * @author Nurlybek
 */
public class IceCream {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        for(int i=0; i<n;i++){
            int c = in.nextInt();
            int l = in.nextInt();
            int[] flavors = new int[l];
            for(int j=0; j<l;j++){
                flavors[j] = in.nextInt();
            }
            answer(c,l,flavors);
        }
    }
    
    public static void answer(int c, int l, int[] flavors){
        for(int i=0; i<l; i++){
            for(int j=i+1;j<l;j++){
                if(flavors[i]+flavors[j]==c){
                    System.out.println((i+1)+" "+(j+1));
                    return;
                }
            }
        }
    }
}

