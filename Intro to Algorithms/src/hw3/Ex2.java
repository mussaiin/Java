/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hw3;

import java.util.Scanner;

/**
 *
 * @author Nurlybek
 */
public class Ex2 {

    public static boolean exist(int[][] a, int i, int j)
    {
        return i>=0 && j >=0 && i < a.length && j < a.length;
    }
    public static int search(int[][] a, int i, int j)
    {
        if(!exist(a, i, j) || a[i][j] == 1)
            return 0;
        if(i == a.length-1 && j == a.length-1)
        {
            return 1; 
        }
        a[i][j] = 1;
        int paths = search(a, i+1, j) + search(a, i-1, j) + search(a, i, j+1) + search(a, i, j-1);
        a[i][j] = 0;
        return paths;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[][] a = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                a[i][j] = in.nextInt();
            }
        }
        System.out.println("There are "+search(a, 1, 0)+" ways to exit the labyrinth");
    }
}
/*
4
0 0 0 1
0 1 0 0
0 0 1 0
1 0 0 0
*/