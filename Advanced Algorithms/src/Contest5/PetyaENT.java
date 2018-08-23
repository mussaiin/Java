/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Contest5;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Nurlybek
 */
public class PetyaENT {    		
    public static void main(String[] args) {
	   		
        Scanner in = new Scanner(System.in);
	
        String s = in.next().trim();
	
        ArrayList<String> a = new ArrayList<String>();
	
        for (int i = 0; i < s.length(); ++i){	
            a.add(s.substring(i, i+1));
        }
        
        String p = in.next().trim();	
        int n = in.nextInt();
	
        for (int i = 0; i < n; ++i){	
            
            String t = in.next().trim();	
            int jt = 0;	
            int k = p.length(), m = t.length();	
            String ans = "";
	
            for (int jp = 0; jp < k && ans.length() == 0; ++jp) {
                String pa = p.substring(jp, jp+1);                               
                String ta = jt < m ? t.substring(jt, jt+1) : "YESS";                                                		                                
                if (pa.equals("?")) { 
                    if (jt < m) {		
                        if (!a.contains(ta)) {
                            ans = "NO";			
                        }
                        else { 
                            ++jt; 
                        }			
                    }		
                    else { 
                        ans = "NO";
                    }		
                }		
                else if (pa.equals("*")) {
                    for (int y = 0; y < m-k+1; ++y) {
                        if (!a.contains(t.substring(jt, jt+1))) {
                            ++jt;
                        }			
                        else {
                            ans = "NO"; 
                        }			
                    }		
                }		
                else {		
                    if(jt < m) {		
                        if (!pa.equals(ta)) {
                            ans = "NO";			
                        }
                        else { 
                            ++jt; 
                        }			
                    }		
                    else {
                        ans = "NO";
                    }		
                }		
            }
	
            if (jt == m && ans.length() == 0) {
                ans = "YES";
            }		
            else {
                ans = "NO";
            }	
            
            System.out.println(ans);	
        }		
    }		
}
