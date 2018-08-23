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
public class Ex2 {
    public static int Bin2Dec(int n){
      if(n>10){
        return n%10+Bin2Dec(n/10)*2;
      }
      else if(n==0){return 0;}
      else{
        return 1;
      }
    }
    public static void main(String [] args){
      Scanner in = new Scanner(System.in);
      int a = in.nextInt();
      System.out.println(Bin2Dec(a));
    }
  
}
