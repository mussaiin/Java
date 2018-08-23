/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Week3lab;

/**
 *
 * @author Nurlybek
 */
public class InsertionSort {
    public static void main(String args[])
    {        
        int[] arr1 = {10,34,2,56,7,67,88,42};
        int temp;
        for (int i = 1; i < arr1.length; i++) {
            for(int j = i ; j > 0 ; j--){
                if(arr1[j] < arr1[j-1]){
                    temp = arr1[j];
                    arr1[j] = arr1[j-1];
                    arr1[j-1] = temp;
                }
            }
        }
        for(int i = 0; i<arr1.length; i++){
            System.out.print(arr1[i]);
            if (i+1!=arr1.length) {
                System.out.print(", ");
            }
        }
    }
}
