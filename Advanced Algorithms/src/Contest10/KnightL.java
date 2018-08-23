/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Contest10;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author Nurlybek
 */
public class KnightL {
    
    public static int calculate(int n, int a, int b) {
        List<Integer> moves = Arrays.asList(0);
        int[][] board = new int[n][n];
        board[0][0] = 1;
        int[][] k = generate(a, b);
        int count = 1;
        do {
            List<Integer> newMoves = new ArrayList<Integer>();
            for(int move : moves) {
                int x = move / n;
                int y = move % n;
                for (int[] next : k) {
                    int nx = x + next[0];
                    int ny = y + next[1];
                    if (nx < 0 || ny < 0 || nx >= n|| ny >= n || board[nx][ny] > 0) continue;
                    else {
                        board[nx][ny] = count;
                        if (nx == n - 1 && ny == n - 1) return count;
                        newMoves.add(nx * n + ny);
                    }
                }
            }
            count++;
            moves = newMoves;
        } while(!moves.isEmpty());
        return -1;
    }
    
    public static int[][] generate(int i, int j) {
        if (i == j) {
            return new int[][]{{i, j}, {i, -j}, {-i, -j}, {-i, j}};
        } else {
            return new int[][]{{i, j}, {i, -j}, {-i, -j}, {-i, j}, {j, i}, {j, -i}, {-j, -i}, {-j, i}};
        }
    }
    
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        for (int i = 1; i < n; i++) {
            for (int j = 1; j < n; j++) {
                System.out.print(calculate(n, i, j) + " ");                                                                                 }
            System.out.println();
        }
    }
}
