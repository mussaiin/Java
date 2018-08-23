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
public class Ex2 {
    public static void main(String[] args) {
        /*
        ax+by+cz+d1=0
        ax+by+cz+d2=0
        d = abs(d1-d2)/sqrt(a^2+b^2+c^2)
        */
        Scanner in = new Scanner(System.in);
        int[][] line1 = new int[2][3];
        int[][] line2 = new int[2][3];
        System.out.println("Input 1st line points: (start point x1 y1 z1, then  end point x2 y2 z2)");

        for(int i = 0; i < 2; i++){
                String[] a = in.nextLine().split(" ");
                for(int j = 0; j < 3; j++){
                        line1[i][j]=Integer.parseInt(a[j]);
                }
        }
        System.out.println("Input 2nd line points: (start point x1 y1 z1, then end point x2 y2 z2)");
        for(int i = 0; i < 2; i++){
                String[] a = in.nextLine().split(" ");
                for(int j = 0; j < 3; j++){
                        line2[i][j] = Integer.parseInt(a[j]);
                }
        }
        double[][] y1y2 = new double[2][3];
        y1y2[0][0] = line1[0][1]-line1[1][1];
        y1y2[0][1] = line1[1][0]-line1[0][0];
        y1y2[0][2] = 0-(line1[0][0]*y1y2[0][0]+line1[0][1]*y1y2[0][1]);
        y1y2[1][0] = line2[0][1]-line2[1][1];
        y1y2[1][1] = line2[1][0]-line2[0][0];
        y1y2[1][2] = 0-(line2[0][0]*y1y2[1][0]+line2[0][1]*y1y2[1][1]);
        double[] res = new double[3];
        if(y1y2[0][0]*y1y2[1][1]-y1y2[0][1]*y1y2[0][1]!=0){ //if (А1*В2 - А2*В1 ≠ 0)
                res[0] = (y1y2[0][2]*y1y2[1][1]-y1y2[1][2]*y1y2[0][1])/(y1y2[0][0]*y1y2[1][1]-y1y2[1][0]*y1y2[0][1]); //х=(С1*B2-С2*B1)/(А1*В2-А2*В1) 
                res[1] = (y1y2[0][0]*y1y2[1][2]-y1y2[1][0]*y1y2[0][2])/(y1y2[0][0]*y1y2[1][1]-y1y2[1][0]*y1y2[0][1]); //y=(A1*C2-A2*C1)/(A1*B2-A2*B1)
        }
        double[][] x1x2 = new double[2][3];
        x1x2[0][0] = line1[0][2]-line1[1][2];
        x1x2[0][1] = line1[1][1]-line1[0][1];
        x1x2[0][2] = 0-(line1[0][1]*x1x2[0][0]+line1[0][2]*x1x2[0][1]);
        x1x2[1][0] = line2[0][2]-line2[1][2];
        x1x2[1][1] = line2[1][1]-line2[0][1];
        x1x2[1][2] = 0-(line2[0][1]*x1x2[1][0]+line2[0][2]*x1x2[1][1]);
        if(x1x2[0][0]*x1x2[1][1]-x1x2[0][1]*x1x2[0][1]!=0){
                res[2] = (x1x2[0][0]*x1x2[1][2]-x1x2[1][0]*x1x2[0][2])/(x1x2[0][0]*x1x2[1][1]-x1x2[1][0]*x1x2[0][1]);
        }
        for(double i : res){
                System.out.println(i*-1);
        }                
    }
}

/*
3 -3 2
2 -2 4
-1 4 -26
2 0 -20
*/