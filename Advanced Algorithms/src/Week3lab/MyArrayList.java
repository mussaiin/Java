/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Week3lab;

import java.util.Arrays;

/**
 *
 * @author Nurlybek
 */
public class MyArrayList {
    private int[] data;
    private int count = 0;
    private int FIXED_SIZE = 8;

    public MyArrayList() {
        data = new int[this.FIXED_SIZE];
    }


    public int get(int index) {
        if (index < count) {	
            return data[index];	
        } else {	
            throw new ArrayIndexOutOfBoundsException();	
        }	
    }

    public void add(int obj) {
        data[count++] = obj;
    }

    public int size() {
	return count;
    }
    public void sort(){
        int temp;
        for (int i = 0; i < data.length; i++) {
            for(int j = i ; j > 0 ; j--){
                if((data[j]) < data[j-1]){
                    temp = data[j];
                    data[j] = data[j-1];
                    data[j-1] = temp;
                }
            }
        }
    }
    public void display(){
        for (int i : data) {
            System.out.print(i+" ");
        }
        System.out.println("");
    }
    public static void main(String[] args) {
        MyArrayList arr = new MyArrayList();
        int[] arr1 = {10, 34, 2, 56, 7, 67, 88, 42};
        for (int i = 0; i < arr1.length; i++) {
            arr.add(arr1[i]);
        }
        arr.display();
        arr.sort();
        arr.display();
    }
}