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
public class Buttons {
    public static void main(String[] args) {    
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();    
        int res = n;
        for (int i = 0; i < n; i++) {
            res = res+(n-i)*i;
        }
        System.out.println(res);
    }
}    

