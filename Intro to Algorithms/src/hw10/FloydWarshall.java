/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hw10;

import java.util.Scanner; 

/**
 *
 * @author Nurlybek
 */
public class FloydWarshall {
    private int distancematrix[][]; 
    private int numberofvertices; 
    public static final int INFINITY = 999; 
    public static void main(String[] arg) { 
        int adjacency_matrix[][]; 
        int numberofvertices; 

        Scanner scan = new Scanner(System.in); 
        System.out.println("Enter the number of vertices"); 
        numberofvertices = scan.nextInt(); 

        adjacency_matrix = new int[numberofvertices + 1][numberofvertices + 1]; 
        System.out.println("Enter the Weighted Matrix: "); 

        for (int source = 1; source <= numberofvertices; source++) 
        { 
            for (int destination = 1; destination <= numberofvertices; destination++) 
            { 
                adjacency_matrix[source][destination] = scan.nextInt(); 
                if (source == destination) 
                { 
                    adjacency_matrix[source][destination] = 0; 
                    continue; 
                } 
                if (adjacency_matrix[source][destination] == 0) 
                { 
                    adjacency_matrix[source][destination] = INFINITY; 
                } 
            } 
        } 


        FloydWarshall floydwarshall = new FloydWarshall(numberofvertices); 
        floydwarshall.floydwarshall(adjacency_matrix); 
        scan.close(); 
    } 
    public FloydWarshall(int numberofvertices) { 
       distancematrix = new int[numberofvertices + 1][numberofvertices + 1]; 
       this.numberofvertices = numberofvertices; 
    } 
 
    public void floydwarshall(int adjacencymatrix[][]) { 
       for (int source = 1; source <= numberofvertices; source++) { 
           for (int destination = 1; destination <= numberofvertices; destination++) { 
               distancematrix[source][destination] = adjacencymatrix[source][destination]; 
           } 
       } 

       for (int intermediate = 1; intermediate <= numberofvertices; intermediate++) { 
           for (int source = 1; source <= numberofvertices; source++) { 
               for (int destination = 1; destination <= numberofvertices; destination++) { 
                   if (distancematrix[source][intermediate] + distancematrix[intermediate][destination] < distancematrix[source][destination]) 
                       distancematrix[source][destination] = distancematrix[source][intermediate] + distancematrix[intermediate][destination]; 
               } 
           } 
       } 
       
       for (int source = 1; source <= numberofvertices; source++) 
       System.out.print(" " + source); 

       System.out.println(); 
           for (int source = 1; source <= numberofvertices; source++) { 
               System.out.print(source + " "); 
               for (int destination = 1; destination <= numberofvertices; destination++) { 
                   System.out.print(distancematrix[source][destination] + " "); 
               } 
               System.out.println(); 
           } 
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