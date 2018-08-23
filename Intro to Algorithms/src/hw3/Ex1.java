/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hw3;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author Nurlybek
 */
public class Ex1 {
    public static void permute(String pre, String a, List ar){
        int n = a.length();
        if(n==0){ar.add(pre);}
        else
        {
            for(int i = 0; i < a.length(); i++){
                permute(pre+a.charAt(i), a.substring(0, i) + a.substring(i+1, a.length()), ar);
            }
        }
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String a = in.nextLine();
        String b = in.nextLine();
        String c = in.nextLine();
        
        List<String> l1= new ArrayList();
        List<String> l2= new ArrayList();
        List<String> l3= new ArrayList();
        
        permute("", a, l1);
        permute("", b, l2);
        for (int i = 0; i < l1.size()+l2.size(); i++) {
            l3.add(c);
        }
        if(l1.size()>l2.size()){
            for (int i = 0; i < l1.size(); i++) {
                for (int j = 0; j < l2.size(); j++) {
                    if(Integer.parseInt(l1.get(i)) + Integer.parseInt(l2.get(j)) == Integer.parseInt(l3.get(i))){
                        System.out.println(l1.get(1)+"+"+l2.get(j)+"="+l3.get(i));
                    }
                }
            }    
        }
        else{
            for (int i = 0; i < l2.size(); i++) {
                for (int j = 0; j < l1.size(); j++) {
                    if(Integer.parseInt(l1.get(j)) + Integer.parseInt(l2.get(i)) == Integer.parseInt(l3.get(i))){
                        System.out.println(l1.get(j)+"+"+l2.get(i)+"="+l3.get(i));
                    }
                }
            }
        }
        
    }
}
