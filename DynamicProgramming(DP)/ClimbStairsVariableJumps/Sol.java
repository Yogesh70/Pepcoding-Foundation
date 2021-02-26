import java.util.*;
import java.io.*;

public class Sol {
    public static void main(String[]args){
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[]jumps = new int[n];

        for(int i=0;i<n;i++){
            jumps[i] = scn.nextInt();
        }
        scn.close();

        // System.out.println(CSVJ(jumps,0));
        // System.out.println(CSVJMemo(jumps,0,new int[n+1]));
        System.out.println(CSVJTab(jumps));
    }

    public static int CSVJ(int[]jumps,int src){
        int dest = jumps.length;

        if(src == dest){
            return 1;
        }

        int ways = 0;
        for(int step=1;step<= jumps[src] && src + step <= dest;step++){
            ways += CSVJ(jumps, src + step);            
        }
        return ways;
    }

    public static int CSVJMemo(int[]jumps,int src,int[] qb){
        int dest = jumps.length;
        if(src == dest){
            return 1;
        }

        if(qb[src] != 0){
            return qb[src];
        }

        int ways = 0;
        for(int step=1;step <= jumps[src] && src + step <= dest;step++){
            ways += CSVJMemo(jumps, src + step, qb);
        }
        
        qb[src] = ways;
        return qb[src];
    }

    public static int CSVJTab(int[]jumps){
        int n = jumps.length;
        int[] dp = new int[n+1];

        // dp[i] -> ways from i to n
        dp[n] = 1;

        for(int i=n-1;i >= 0;i--){
            
            int ways = 0;
            for(int step=1;step <= jumps[i];step++){
                int itr = i + step;

                if(itr <= n){
                    ways += dp[itr];
                }
            }
            dp[i] = ways;
        }
        return dp[0];
    }
}