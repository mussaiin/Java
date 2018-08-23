/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hw6;
import java.util.Scanner;
/**
 *
 * @author Nurlybek
 */
public class HeapSort {
    private static int N;
    public static void sort(int A[])
    {       
        heapify(A);        
        for (int i = N; i > 0; i--)
        {
            swap(A, 0, i);
            N = N-1;
            maxheap(A, 0);
        }
    }     
    public static void heapify(int A[])
    {
        N = A.length-1;
        for (int i = N/2; i >= 0; i--)
            maxheap(A, i);        
    }
    public static void maxheap(int A[], int i)
    { 
        int left = 2*i;
        int right = 2*i+1;
        int max = i;
        if (left <= N && A[left] > A[i])
            max = left;
        if (right <= N && A[right] > A[max])        
            max = right;
 
        if (max != i)
        {
            swap(A, i, max);
            maxheap(A, max);
        }
    }    

    public static void swap(int A[], int i, int j)
    {
        int tmp = A[i];
        A[i] = A[j];
        A[j] = tmp; 
    }    
    public static void main(String[] args) 
    {
        Scanner in = new Scanner(System.in);        
        int n, i;    
        System.out.println("number of elements");
        n = in.nextInt();    
        int arr[] = new int[n];
        for (i = 0; i < n; i++)
            arr[i] = in.nextInt();
        sort(arr);

        System.out.println("\nSorted elements: ");        
        for (i = 0; i < n; i++)
            System.out.print(arr[i]+" ");            
        System.out.println();            
    }    
}

