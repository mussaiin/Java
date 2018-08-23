/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hw4;

import java.util.LinkedList;
import java.util.Queue;

/**
 *
 * @author Nurlybek
 */
public class Ex2_2 {
    class Cell{
        int x, y;
        int dis;
        Cell() {}
        Cell(int x, int y, int dis) {
            this.x=x;
            this.y=y;
            this.dis=dis;
        }
    }
    public static boolean isInside(int x, int y, int N)
    {
        if (x >= 1 && x <= N && y >= 1 && y <= N)
            return true;
        return false;
    }

    public static int minStepToReachTarget(int knightPos[], int targetPos[],int N)
    {
        int dx[] = {-2, -1, 1, 2, -2, -1, 1, 2};
        int dy[] = {-1, -2, -2, -1, 1, 2, 2, 1};
   
/*        Queue<int[]> q = new LinkedList<>();
        q.push(Cell(knightPos[0], knightPos[1], 0));
        Cell t;
        int x, y;
        boolean [][] visit = new boolean[N + 1][N + 1];
        for (int i = 1; i <= N; i++)
            for (int j = 1; j <= N; j++)
                visit[i][j] = false;
        visit[knightPos[0]][knightPos[1]] = true;
        while (!q.isEmpty())
        {
            t = q.element();
            q.poll();
            visit[t.x][t.y] = true;
            if (t.x == targetPos[0] && t.y == targetPos[1])
                return t.dis;
            for (int i = 0; i < 8; i++)
            {
                x = t.x + dx[i];
                y = t.y + dy[i];
                if (isInside(x, y, N) && !visit[x][y])
                    q.push(Cell(x, y, t.dis + 1));
            }
        }*/
        return 0;
    }
    public static void main(String[]args){
        int N = 6;
        int knightPos[] = {4, 5};
        int targetPos[] = {1, 1};
        System.out.println(minStepToReachTarget(knightPos, targetPos, N)); 

    }
    
}