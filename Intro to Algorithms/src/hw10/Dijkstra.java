/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hw10;

import java.util.Scanner;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author Nurlybek
 */
public class Dijkstra {

    static int[][] graph={ 
        {0,5,0,9,2,0}, 
        {5,0,2,0,0,0}, 
        {0,2,0,3,0,0}, 
        {9,0,3,0,0,2}, 
        {2,0,0,0,0,3}, 
        {0,0,0,2,3,0}}; 
    static String[] vertexes = {"A", "B", "C", "D", "E", "F"};
    static Map<String, Integer> distanceMap = new HashMap<String, Integer>();
    static Map<String, Integer> map = new HashMap<String, Integer>(); //INFs 

    public static void main(String[] args) {
        for (int i = 0; i < graph.length; i++) {
            map.put(vertexes[i], -1);
        }
        algorithm(4); //FROM (0 A, 1 B, 2 C, 3 D, 4 E, 5 F)
        for (Object key : distanceMap.keySet()) {
            System.out.println(key + " " + distanceMap.get(key));
        }
    }

    static void algorithm(int source) {
        int current = source;
        distanceMap.put(vertexes[current], 0);
        map.remove(vertexes[current]);
        while (distanceMap.size() != graph.length) {
            for (int i = 0; i < graph.length; i++) {
                if (graph[current][i] != 0 && map.containsKey(vertexes[i])) {
                    int NEW = graph[current][i] + distanceMap.get(vertexes[current]);
                    int PAST = map.get(vertexes[i]);
                    if (PAST == -1 || PAST > NEW) {
                        map.put(vertexes[i], NEW);
                    }
                }
            }
            String vertex = "";
            double min = Double.POSITIVE_INFINITY;
            for (Object key : map.keySet()) {
                if (map.get(key) != -1) {
                    if (min > map.get(key)) {
                        min = (double) map.get(key);
                        vertex = (String) key;
                        current = Arrays.asList(vertexes).indexOf(vertex);
                    }
                }
            }
            distanceMap.put(vertex, (int) min);
            map.remove(vertex);
        }
    }
}
