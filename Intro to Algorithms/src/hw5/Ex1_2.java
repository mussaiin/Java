/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hw5;

import java.util.Scanner;

/**
 *
 * @author Nurlybek
 */
public class Ex1_2 {
    public static void main(String[] arg){
        Scanner in = new Scanner(System.in);
        int n = Integer.parseInt(in.nextLine());
        int[][] points = new int[n][2];
        String[] p;
        for(int i = 0; i < n; i++){
            p = in.nextLine().split(" ");
            for(int j = 0; j < 2; j++){
                points[i][j] = Integer.parseInt(p[j]);
            }
        }

        double[] s = new double[n];
        double[] va = new double[n];
        int[] point1=points[0];
        for(int i = 0; i < n; i++){
            int[] point2 = points[i];
            int[] point3 = points[i+1==n?0:i+1];
            double a = Math.sqrt(Math.pow(point1[0]-point2[0],2)+Math.pow(point1[1]-point2[1],2));
            double b = Math.sqrt(Math.pow(point1[0]-point3[0],2)+Math.pow(point1[1]-point3[1],2));
            double c = Math.sqrt(Math.pow(point3[0]-point2[0],2)+Math.pow(point3[1]-point2[1],2));
            double per = (a+b+c)/2;
            s[i] = Math.sqrt(per*(per-a)*(per-b)*(per-c));
            va[i] = point2[0]*point3[1]-point2[1]*point3[0];
        }
        double heron = 0;
        double other = 0;
        for(int i = 0; i < s.length; i++){
            heron += s[i];
            other += va[i];
        }
        System.out.println(heron);
        System.out.println(Math.abs(other/2));
    }
}    

/*
4
4 10
9 7
11 2
2 2
*/