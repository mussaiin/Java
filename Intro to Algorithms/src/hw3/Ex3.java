/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hw3;

import java.util.*;

/**
 *
 * @author Nurlybek
 */

public class Ex3{
    Scanner in = new Scanner(System.in);
    public int a[] = new int[50];
    public void merge_sort(int left, int right)
    {
        int mid;
        if(left<right)
        {
            mid = (left+right)/2;
            merge_sort(left, mid);
            merge_sort(mid+1, right);
            merge(left, mid, right);
        }
    }
    public void merge(int left, int mid, int right)
    {
        int h, i, j, k;
        int b[] = new int[11];
        h = left;
        i = left;
        j = mid+1;

        while((h <= mid) && (j <= right))
        {
            if(a[h] <= a[j])
            {
                b[i] = a[h];
                h++;
                for (int l = 0; l < b.length; l++) {
                    System.out.print(b[l]);
                }
                System.out.println("");
            }
            else
            {
                b[i] = a[j];
                j++;
                for (int l = 0; l < b.length; l++) {
                    System.out.print(b[l]);
                }System.out.println("");
            }
            i++;
        }
        if(h > mid)
        {
            for(k = j; k <= right; k++)
            {
                b[i] = a[k];
                i++;
                for (int l = 0; l < b.length; l++) {
                    System.out.print(b[l]);
                }System.out.println("");
            }
        }
        else
        {
            for(k = h; k <= mid; k++)
            {
                b[i] = a[k];
                i++;
                for (int l = 0; l < b.length; l++) {
                    System.out.print(b[l]);
                }System.out.println("");
            }
        }
        for(k = left; k <= right; k++) 
            a[k] = b[k];
    }
    public Ex3()
    {
        int num;
        num = in.nextInt();
        for(int i = 0; i < num; i++)
        {
            a[i] = in.nextInt() ;
        }
        merge_sort(0, num-1);
        for(int i = 0; i < num; i++)
            System.out.print(a[i]+" ");
    }
   public static void main(String[] args) {
       new Ex3();
   }
}
/*
6
4 2 3 5 1 6
*/