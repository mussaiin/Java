/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hw2;

import java.util.Arrays;
import java.util.Scanner;

/**   
 *
 * @author Nurlybek
 */

public class Ex2 {
    public static void main(String [] args){
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        in.nextLine();
      
        int [] x = new int[a*2];
        int [] z = new int[a];
        int [] y = new int[a];
        
        for(int i = 0; i < a; i++){
            String s = in.nextLine();
            String [] b = s.split(" ");
            String [] c = b[0].split(":");
            String [] d = b[1].split(":");
            int f = Integer.parseInt(c[0])*60+Integer.parseInt(c[1]);
            int h = Integer.parseInt(d[0])*60+Integer.parseInt(d[1]);
            z[i]=f; 
            y[i]=h; 
        }
        
        int [] t = new int[a*2];
        for(int i = 0; i < a; i++){
            t[i] = z[i];
            t[a+i] = y[i];
        }
        Arrays.sort(t);
        for(int i = 0; i < a*2; i++){
            for(int j = 0; j < a; j++){
                if(t[i]==z[j]) x[i] = j;
                else if(t[i]==y[j]) x[i] = j;
            }
        }
        
        int m = 0;
        int temp = 0;
        int [] k = new int[a*2];
        for(int i = 0; i < a*2; i++){
            k[i] = -1;
        }
        for(int i = 0; i < a*2; i++){
            for(int j = 0; j < a; j++){
                if(k[j]==x[i]){
                    if(m < temp) m = temp;
                    temp = temp-1;
                }
            }
            temp=temp+1;
            k[i]=x[i];
        }
        System.out.println(m);
        
    }
}
/*
6
9:00 10:07 
10:20 11:35 
12:00 17:00 
11:00 11:30 
11:20 12:30 
11:30 18:15
*/