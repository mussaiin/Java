/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hw10;

/**
 *
 * @author Nurlybek
 */
public class Floyd {	
    final static int INF = 99999, V = 4;
    void floydWarshall(int graph[][])
    {		
        int dist[][] = new int[V][V];		
        int i, j, k;		
        for (i = 0; i < V; i++){
            for (j = 0; j < V; j++){	
                dist[i][j] = graph[i][j];
            }
        }
        for (k = 0; k < V; k++)	
        {           
            for (i = 0; i < V; i++){                  
                for (j = 0; j < V; j++){
                    if (dist[i][k] + dist[k][j] < dist[i][j])
                        dist[i][j] = dist[i][k] + dist[k][j];
		}
            }
	}
	printSolution(dist);
    }

    void printSolution(int dist[][])
    {		
        for (int i=0; i<V; ++i)		
        {		
            for (int j=0; j<V; ++j)		
            {		
                if (dist[i][j]==INF)		
                    System.out.print("INF ");			
                else
                    System.out.print(dist[i][j]+" ");
            }
            System.out.println();
        }
    }

    public static void main (String[] args)
    {
	/* 
             10
       (1)------->(4)
        |         /|\
      5 |          |
        |          | 1
       \|/         |
       (2)------->(3)
             3       
        */
        int graph[][] = { 
            {0, 5, INF, 10},
            {INF, 0, 3, INF},
            {INF, INF, 0, 1},
            {INF, INF, INF, 0}
        };
        Floyd a = new Floyd(); 
        a.floydWarshall(graph);
    }
}

