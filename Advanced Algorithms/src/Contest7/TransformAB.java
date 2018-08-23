/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Contest7;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Nurlybek
 */
public class TransformAB {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
	int a = in.nextInt(), b = in.nextInt();
	ArrayList list = new ArrayList();
	while(b > a) {
            list.add(b);
		if(b%2 == 0) {
                    b/=2;
		} else {
                    if(b%10 == 1) {
                        b/=10;
                    } else {
                        System.out.println("NO");
                        return;
                    }
                }
	}
	if(a != b) {
            System.out.println("NO");	
            return;	
        }	
        list.add(a);	
        System.out.println("YES\n" + list.size());	
        for(int i = list.size()-1 ; i >= 0 ; i--){
            System.out.print(list.get(i) + " ");
        }
    }    
}

