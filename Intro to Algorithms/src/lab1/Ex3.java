/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab1;

import java.util.Scanner;

/**
 *
 * @author Nurlybek
 */
public class Ex3 {
    public static void main(String [] args)
    {
        Scanner in=new Scanner(System.in);
        int dec=in.nextInt();
        String bin="";
        {
            while(dec>0)
            {
                bin=(dec%2)+bin;
                dec=dec/2;
            }
            System.out.println(""+bin);
        }
    }
}
