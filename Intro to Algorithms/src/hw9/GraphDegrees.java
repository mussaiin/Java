/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hw9;

import java.util.Scanner;

/**
 *
 * @author Nurlybek
 */
public class GraphDegrees {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);        
        int n = in.nextInt();
        int [][] a = new int[n][n];
        int [] deg = new int[n];
        for (int i = 0; i < n; i++) {           
            for (int j = 0; j < n; j++) {
                a[i][j] = in.nextInt();
                if(i==j && a[i][j]==1){
                    a[i][j]=2;
                }
            }
        }
        System.out.println("");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++){
                System.out.print(a[i][j]+" ");
                deg[j]+=a[i][j];
                if(a[i][j]!=2){
                    deg[i]+=a[i][j];
                }
            }
            System.out.println("");
        }
        System.out.println("");
        for (int i = 0; i < deg.length; i++) {
            System.out.print(deg[i]+" ");
        }
        
    }
    
}
/*
5
1 1 0 0 0
0 0 1 0 1
1 0 1 0 1
0 1 0 0 1
1 0 0 0 1
if (a[i][j]==1 || a[j][i]==1) {
                    deg[i]+=1;
                } else
for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if(i==j && a[i][j]==1){
                    deg[i]+=2;
                }
                else if(i!=j && a[i][j]==1)
                {
                    deg[i]+=1;
                }
                else
                    deg[i]+=0;
            
*/

