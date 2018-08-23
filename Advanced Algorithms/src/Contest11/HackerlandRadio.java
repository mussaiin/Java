/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Contest11;
import java.util.Arrays;
import java.util.Scanner;
/**
 *
 * @author Nurlybek
 */
public class HackerlandRadio {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int k = in.nextInt();
        int[] x = new int[n];
        for (int i = 0; i < n; i++) {
            x[i] = in.nextInt();
        }
        
        Arrays.sort(x);
        
        int left = 0, right, mid, ans = 0;
        int end;
        
        while(left < n) {
            right = left;
            mid = left;
            ans++;
            
            while(mid < n && x[mid] - x[left] <= k) {
                mid++; 
            }
            mid--;
            end = x[mid] + k;
            right = mid + 1;
            
            while(right < n && x[right] <= end) {
                right++;
            }
            left = right;
        }
        
        System.out.println(ans);
    }
}

