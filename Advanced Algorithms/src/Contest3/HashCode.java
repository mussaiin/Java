/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Contest3;

import java.util.Scanner;

/**
 *
 * @author Nurlybek
 */
public class HashCode {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        int k = in.nextInt();
        int n = in.nextInt();
        
        int cell[] = new int[301];
        int ans = -1;
        
        for(int i = 1; i <= n; i++) {
            
            int x = in.nextInt();
            x %= k;
            
            if(cell[x] == 0) {
                cell[x] = 1;
                continue;
            }
            else {
                if(ans == -1) {
                    ans = i;
                }
            }
        }
        System.out.println(ans);
    }
}
