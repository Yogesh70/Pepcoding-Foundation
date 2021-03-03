import java.util.*;
public class Sol {
    public static void main(String[]args){
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[] jumps = new int[n];

        for(int i=0;i<n;i++){
            jumps[i] = scn.nextInt();
        }
        scn.close();

        // System.out.println(CSMinMoves(jumps,0));
        // System.out.println(CSMinMovesMemo(jumps,0,new int[n+1]));
        System.out.println(CSMinMovesTab(jumps));
    }

    public static int CSMinMoves(int[] jumps,int src){
        int dest = jumps.length;

        if(src == dest){
            return 0;
        }

        int min = Integer.MAX_VALUE;
        for(int step=1;step<= jumps[src] && src + step <= dest;step++){
            int moves = CSMinMoves(jumps, src + step);
            
            if(moves < min){
                min = moves;
            }
        }
        
        // prevent -infinity ->     infinity + 1 = -infinity
        if(min == Integer.MAX_VALUE){
            return min;
        }

        int ans = min + 1;
        return ans;
    }

    public static int CSMinMovesMemo(int[]jumps,int src,int[] qb){
        int dest = jumps.length;
        
        if(src == dest){
            return 0;
        }

        if(qb[src] != 0){
            return qb[src];
        }

        int min = Integer.MAX_VALUE;
        for(int step=1;step <= jumps[src] && src + step <= dest;step++){
            int moves = CSMinMovesMemo(jumps,src + step,qb);

            if(moves < min){
                min = moves;
            }
        }

        if(min == Integer.MAX_VALUE){
            qb[src] = min;
            return min;
        }

        int ans = min + 1;
        qb[src] = ans;
        return ans;
    }

    public static int CSMinMovesTab(int[]jumps){
        int n = jumps.length;
        
        int[] dp = new int[n+1];

        // dp[i] -> Min moves from ith to dest
        dp[n] = 0;

        for(int i = n-1;i >= 0;i--){

            int min = Integer.MAX_VALUE;
            for(int step=1;step <= jumps[i];step++){
                int itr = step + i;

                if(itr <= n && dp[itr] < min){
                    min = dp[itr];
                }
            }

            if(min == Integer.MAX_VALUE){
                dp[i] = min;
            } 
            else {
                dp[i] = min + 1;
            }
        }
        return dp[0];
    }
}
