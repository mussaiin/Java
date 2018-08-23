/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hw9;

import java.util.Scanner;
import java.util.Collections; 
import java.util.HashMap; 
import java.util.Map; 
import java.util.Stack; 
import java.util.ArrayList; 

/**
 *
 * @author Nurlybek
 */
public class ShortestPath {
    static int size; 
    static int [][] map; 
    static boolean [][] visited; 
    static Stack stack = new Stack(); 
    static Map var = new HashMap(); 
    static ArrayList<Integer> arr = new ArrayList<Integer>(); 
    
    static void shortestPath(int x){ 
        if(x==(size-1)){ 
            int length=0; 
            ArrayList<Integer> arr = new ArrayList<Integer>(); 
            for(Object i: stack){ 
                arr.add((int)i+1); 
            } 
            for(int i = 0; i < arr.size()-1; i++){ 
                length+=map[arr.get(i)-1][arr.get(i+1)-1]; 
            } 
            var.put(arr,length); 
            arr.add(length); 
        } 
        else{ 
            for(int i = 0; i < size; i++){ 
                if(map[x][i]!=0 && !visited[x][i]){ 
                    visited[i][x] = true;
                    visited[x][i] = true; 
                    stack.push(i); 
                    shortestPath(i); 
                } 
            } 
        } 
        stack.pop(); 
    } 
    
    
    public static void main(String[] args) {        
        Scanner s = new Scanner(System.in); 
        System.out.print("Enter the size-->"); 
        size = s.nextInt(); 
        map= new int[size][size]; 
        for(int i = 0; i < size; i++){ 
            for(int j = 0;j < size; j++){ 
                map[i][j] = s.nextInt(); 
            } 
        } 
        stack.push(0);
        visited = new boolean[size][size]; 
        visited[0][0] = true; 
        shortestPath(0); 
        Collections.sort(arr); 
        for(Object key : var.keySet()){ 
            if(var.get(key)==arr.get(0)){ 
                System.out.println(var.get(key)); 
                System.out.println(key); 
            } 
        } 
        System.out.println(); 
    } 
}
/*
5
0 2 0 0 7
2 0 1 0 3 
0 1 0 0 2
0 0 0 0 2
7 3 2 2 0
*/