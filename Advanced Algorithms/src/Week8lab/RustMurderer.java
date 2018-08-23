/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Week8lab;

import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

/**
 *
 * @author Nurlybek
 */
public class RustMurderer {
    //hackerrank
    
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int T = in.nextInt();
        for(int t = 0; t < T; t++)
        {
            int N = in.nextInt();
            int M = in.nextInt();
            HashMap<Integer, HashSet<Integer>> cityMap = new HashMap<>();

            for(int i = 0; i < M; i++)
            {
                int source = in.nextInt();
                int target = in.nextInt();
                if(cityMap.containsKey(source)) {
                    cityMap.get(source).add(target);
                }
                else 
                {
                    HashSet<Integer> roads = new HashSet<>(); 
                    roads.add(target);
                    cityMap.put(source, roads);
                }
                if(cityMap.containsKey(target)){
                    cityMap.get(target).add(source);                    
                }
                else 
                {
                    HashSet<Integer> roads = new HashSet<>(); 
                    roads.add(source);
                    cityMap.put(target, roads);
                }
            }
            
            int startingPoint = in.nextInt();
            
            int[] distances = BFS_Distance(startingPoint, cityMap, N);
            
            String output = "";
            for(int i = 0; i < distances.length; i++)
            {
                if(i+1 != startingPoint)
                    output+=(distances[i]+" ");
            }
            System.out.println(output);
        }
    }
    
  
   static int[] BFS_Distance(int root, HashMap<Integer,HashSet<Integer>> graph, int N)
    {
        int[] distances = new int[N];
        
        HashSet<Integer> notVisited = new HashSet<>();
        HashSet<Integer> visited = new HashSet<>();
        
        for(int i = 1; i <= N; i++) {
            notVisited.add(i);
        }
        
        Queue<Integer> queue = new LinkedList<>();
        
        queue.offer(root);
        notVisited.remove(root);
        distances[0] = 0;
        
        while(!queue.isEmpty())
        {
            int curr = queue.poll();
            HashSet<Integer> neighbors = graph.get(curr);
                
            for(int nv : notVisited){
                if(neighbors == null || !neighbors.contains(nv))
                {
                    queue.offer(nv);
                    distances[nv-1] = distances[curr-1]+1;
                    visited.add(nv);
                } 
            }
            notVisited.removeAll(visited);
            visited = new HashSet<>();
        }
        return distances;
    }
}
