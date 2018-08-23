/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Contest9;

import java.util.Scanner;

/**
 *
 * @author Nurlybek
 */
public class FixTree {
    private static int[] roots;
    private static int[] parents;    
    private static void join(int u, int v) {
        u = find(u);
        v = find(v);
        if (u != v) {
            roots[u] = v;
        }
    }
    private static int find(int u) {
        return roots[u] == u || roots[u] == 0 ? u : (roots[u] = find(roots[u]));
    } 
    
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String[] line;
        line = in.nextLine().split(" ");
        int n = Integer.parseInt(line[0]);            
        roots = new int[n + 1];        
        parents = new int[n + 1];        
        int[] parent = new int[n + 1];        
        line = in.nextLine().split(" ");        
        int root = -1;            
        for (int i = 0; i < line.length; ++i) {        
            int u = i + 1;            
            int v = Integer.parseInt(line[i]);            
            parent[u] = v;            
            if (find(u) != find(v)) {            
                parents[u] = v;                
                join(u, v);                
            } else {           
                parents[u] = u;                
                if (u == v) {                
                    root = u;                    
                }                
            }            
        }        
        if (root < 0) {        
            root = find(1);            
        }        
        int count = 0;        
        for (int i = 1; i <= n; ++i) {        
            if (parents[i] == i) {            
                parents[i] = root;                
            }           
            if (parents[i] != parent[i]) {            
                ++count;                
            }            
        }        
        System.out.println(count);        
        for (int i = 1; i <= n; ++i) {        
            System.out.print(parents[i] + " ");            
        }        
    }    
}
