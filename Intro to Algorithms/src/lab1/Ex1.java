/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab1;

import java.util.Scanner;

/**
 *
 * @author Nurlybek
 */
public class Ex1 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int b = in.nextInt();
        int c = in.nextInt();
        double x1 = 0.0, x2 = 0.0, delta = 0.0;
        delta = (Math.pow(b, 2) - 4 * a * c);
        x1 = (-b + Math.sqrt(delta)) / (2*a);
        x2 = (-b - Math.sqrt(delta)) / (2*a);
        System.out.println("x1 = " + ((delta<0.0) ? "No Real Solution" : x1));
        System.out.println("x2 = " + ((delta<0.0) ? "No Real Solution" : x2));
    }
}
