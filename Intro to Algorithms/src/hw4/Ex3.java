/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hw4;

import java.util.Scanner;
import java.util.Stack;

/**
 *
 * @author Nurlybek
 */

public class Ex3 {
    static String output = "";
    //static Stack<Integer> st = new Stack();
    public static void main(String[]args){
        String input = "1 3 2 5 3 4";
        ok(input);
        output = output+ "0 ";
        System.out.println("Output: "+output);        
    }
    static void ok(String str){
        String[]strToArr = str.split(" ");
        for(int i = 0; i < strToArr.length-1; i++){
            int q = Integer.parseInt(strToArr[i]);
            int j = i+1;
            while(j<strToArr.length && q==Integer.parseInt(strToArr[i])){
                if(q < Integer.parseInt(strToArr[j])){
                    q=Integer.parseInt(strToArr[j]);
                    output = output+ q + " ";
                }
                j++;
            }
            if(q==Integer.parseInt(strToArr[i])){
                output = output+ "0" + " ";
            }
        }
    }
}
