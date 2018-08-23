/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hw7;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author Nurlybek
 */
public class Substring {

    public static List<Integer> LDS(Integer[] a) {
      int[] m = new int[a.length];
      for (int i = a.length-2; i >= 0; i--) { // {1 2 3V 4 5}
        for (int j = a.length-1; j > i; j--) { // {1 2 3 4V 5}
          if (m[i] <= m[j] && a[i] > a[j]) { //{1 2 3 4 5}
            m[i]++;
          }
        }
      }
      int max = m[0];
      for (int i = 0; i < m.length; i++) {
        if (max < m[i]) {
          max = m[i];
        }
      }
      List<Integer> result = new ArrayList<Integer>();
      for (int i = 0; i < m.length; i++) {
        if (max == m[i]) {
          result.add(a[i]);
          max--;
        }
      }
      return result;
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        Integer [] a = new Integer[n];
        for (int i = 0; i < n; i++) {
            a[i]=in.nextInt();
        }
        List<Integer> res = LDS(a);
        
        System.out.println("Length of the longest decreasing substring is "+res.size());
        System.out.println(res);
    }
    
}
