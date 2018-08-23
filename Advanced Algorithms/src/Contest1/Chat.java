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
public class Chat {
    public static void main(String[] args) {    
        Scanner in = new Scanner(System.in);
            String s1 = in.nextLine(); //"ahhellllloou"
            String s2 = "hello", s3="";
            int a=0;
            for (int i = 0; i < s2.length(); i++) {
                for (int j = a; j < s1.length(); j++) {
                    if(s2.charAt(i)!=s1.charAt(j)) {                    
                        s3+="";
                    }
                    else{
                        s3+=s1.charAt(j);
                        a=j+1;
                        break;
                    }
                }
            }
            if(s2.equals(s3)){
                System.out.println("YES");
            }
            else{
                System.out.println("NO");
            }
    }
}