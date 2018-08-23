/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Week3lab;

import java.util.ArrayList;

/**
 *
 * @author Nurlybek
 */
class Node
{
    protected int data;
    protected Node link;
    
    public Node()
    {
        link = null;
        data = 0;
    }    
    public Node(int d, Node n)
    {
        data = d;
        link = n;
    }    
    public void setLink(Node n)
    {
        link = n;
    }    
    public void setData(int d)
    {
        data = d;
    }    
    public Node getLink()
    {
        return link;
    }    
    public int getData()
    {
        return data;
    }
}

public class MyLinkedList {
    protected Node start;
    protected Node end;
    public int size;
    int[]a;
    public MyLinkedList()
    {
        start = null;
        end = null;
        size = 0;
    }

    public boolean isEmpty()
    {
        return start == null;
    }

    public int getSize()
    {
        return size;
    }    

    public void insert(int val)
    {
        Node nptr = new Node(val, null);    
        size++;    
        if(start == null) 
        {
            start = nptr;
            end = start;
        }
        else 
        {
            end.setLink(nptr);
            end = nptr;
        }
    }
    
    public void display()
    {
        a = new int[size];
        int c = 0;
        Node ptr = start;
        System.out.print(start.getData()+ " ");
        a[c]=start.getData();
        c++;
        ptr = start.getLink();
        while (ptr.getLink() != null)
        {
            a[c]=ptr.getData();
            System.out.print(ptr.getData()+ " ");
            ptr = ptr.getLink();
            c++;
        }
        a[c]=ptr.getData();
        System.out.print(ptr.getData()+ "\n");
    }
    public void sort(){
        int temp=0;
        for (int i = 1; i < a.length; i++) {
            for(int j = i ; j > 0 ; j--){
                if(a[j] < a[j-1]){
                    temp = a[j];
                    a[j] = a[j-1];
                    a[j-1] = temp;
                }
            }
        }
        for (int i : a) {
            System.out.print(i+" ");
        }
    }
    public static void main(String[] args) {
        MyLinkedList arr = new MyLinkedList();
        arr.insert(0);
        arr.insert(2);
        arr.insert(3);
        arr.insert(2);
        arr.insert(10);
        arr.insert(5);
        arr.display();
        arr.sort();
    }
}
 
