/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Contest8;

import java.util.Scanner;

/**
 *
 * @author Nurlybek
 */
public class HardTask {
    private static final long INF = 99999999999999L;
    public static void main(String[] args) {    
        Scanner in = new Scanner(System.in);

        int n = in.nextInt();
        int[] cost = new int[n];
        for (int i = 0; i < n; ++i)
        {
            cost[i] = in.nextInt();
        }

        String s = in.next();
        long ansRev = cost[0];
        long ans = 0;

        for (int i = 1; i < n; ++i)
        {
            long prevAnsRev = ansRev;
            long prevAns = ans;
            ansRev = INF;
            ans = INF;

            String prevStr = s;
            s = in.next();
            String prevRevStr = new StringBuilder(prevStr).reverse().toString();
            String revStr = new StringBuilder(s).reverse().toString();

            if (prevAns != INF && s.compareTo(prevStr) >= 0)
            {
                ans = prevAns;
            }
            if (prevAnsRev != INF && s.compareTo(prevRevStr) >= 0)
            {
                ans = Math.min(ans, prevAnsRev);
            }
            if (prevAns != INF && revStr.compareTo(prevStr) >= 0)
            {
                ansRev = prevAns + cost[i];
            }
            if (prevAnsRev != INF && revStr.compareTo(prevRevStr) >= 0)
            {
                ansRev = Math.min(ansRev, prevAnsRev + cost[i]);
            }
        }

        long answer = Math.min(ansRev, ans);
        if (answer != INF) {
            System.out.println(answer);
        } else {
            System.out.println("-1");
        }
    }
}
