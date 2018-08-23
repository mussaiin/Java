/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Contest11;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author Nurlybek
 */
public class ScherlockAnagram {
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        int m = in.nextInt();
        while(m!=0)
        {
            String s = in.next();
            int n = s.length();
            int p = 0, t=0;
            int z = (n*n)-(((n*n)-n)/2);
            String pos[] = new String[z];
            for(int x=0;x<n;x++)
            {
                for(int y=0;y<n;y++)
                {
                    if(x<=y)
                    {
                        String temp = s.substring(x,y+1);
                        char c[] = temp.toCharArray();
                        Arrays.sort(c);
                        temp = new String(c);
                        pos[p] = temp;
                        p++;
                    }
                }
            }
            for(int i=0;i<z;i++)
            {
                for(int j=i+1;j<z;j++)
                {
                    if(pos[i].equals(pos[j]))
                    {
                        t++;
                    }
                }
            }
            System.out.println(t);
            m--;
        }
    }
}
