/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
//package Contest10;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;

/**
 *
 * @author Nurlybek
 */
public class MinimumLoss {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        long arr[] = new long[n];
        HashMap<Long, Integer> map = new HashMap<Long, Integer>();
        for(int i = 0; i < n; i++){
            arr[i] = in.nextLong();
            map.put(arr[i], i);
        }
        long loss = Long.MAX_VALUE;
        Arrays.sort(arr);
        for(int i = n-1; i > 0; i--){
            if(map.get(arr[i]) < map.get(arr[i-1])){
                loss = Math.min(loss, arr[i] - arr[i-1]);
            }
        }
        System.out.println(loss); 
    }
}
