/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hw5;

/**
 *
 * @author Nurlybek
 */
public class Ex1 {
    public static double polygonArea(double X[], double Y[]){
        double area = 0.0;
        int n = X.length;
        int j = n-1;
        for (int i = 0; i < n; i++) {
            area+=(X[i]+X[j])*(Y[j] - Y[i]);
            j = i; 
        }
        return Math.abs(area/2);
    }
    public static void main(String[] args) {
        double X[] = {0, 2, 4};
        double Y[] = {1, 3, 7};
        System.out.println(polygonArea(X, Y));
    }
}

/*
0    1
2    3
4    7
0    1 x2
*/