import java.util.*;

public class Sol {
    public static void main(String[]args){
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[] qb = new int[n+1];
        scn.close();

        // System.out.println(climbStairs(0,n));
        // System.out.println(climbStairsMemo(0,n,qb));
        System.out.println(climbStairsTab(n));
    }

    public static int climbStairs(int src,int dest){
        if(src > dest){
            return 0;
        }

        if(src == dest){
            return 1;
        }

        int step1 = climbStairs(src+1,dest);
        int step2 = climbStairs(src+2,dest);
        int step3 = climbStairs(src+3,dest);

        int ways = step1 + step2 + step3;

        return ways;
    }

    public static int climbStairsMemo(int src,int dest,int[] qb){
        if(src > dest){
            return 0;
        }

        if(src == dest){
            return 1;
        }

        if(qb[src] != 0){
            return qb[src];
        }

        int step1 = climbStairsMemo(src+1,dest,qb);
        int step2 = climbStairsMemo(src+2,dest,qb);
        int step3 = climbStairsMemo(src+3,dest,qb);

        int ways = step1 + step2 + step3;
        qb[src] = ways;

        return qb[src];
    }

    public static int climbStairsTab(int n){
        // creation of memory
        int[] qb = new int[n+1];

        // qb[i] = ways from ith stair to n
        qb[n] = 1;

        for(int i=n-1;i>= 0;i--){

            if(i == n-1){
                qb[i] = qb[i+1];
            } 
            else if(i == n-2){
                qb[i] = qb[i+1] + qb[i+2];
            } 
            else {
                qb[i] = qb[i+1] + qb[i+2] + qb[i+3];
            }
        }
        return qb[0];
    }
}
