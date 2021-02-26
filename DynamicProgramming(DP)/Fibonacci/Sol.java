import java.util.*;

public class Sol {
    
    public static void main(String[]args){
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();

        int[] dp = new int[n+1];
        scn.close();

        // System.out.println(fib(n));
        // System.out.println(fibMemo(n, dp));
        System.out.println(fibTab(n));
    }

    public static int fib(int n){
        if(n == 0 || n == 1){
            return n;
        }

        int fibn = fib(n-1) + fib(n-2);
        return fibn;
    }

    public static int fibMemo(int n,int[] qb){
        // qb -> ques bank

        if(n == 0 || n == 1){
            return n;
        }

        // qb[n] -> nth fib no.

        if(qb[n] != 0){
            return qb[n];
        }

        int fibn = fibMemo(n-1,qb) + fibMemo(n-2,qb);
        qb[n] = fibn;

        return qb[n];
    }

    public static int fibTab(int n){
        // Create Memory
        int[] dp = new int[n+1];

        // dp[i] -> Fibonaci of i (Meaning to memory)
        dp[0] = 0;
        dp[1] = 1;

        for(int i=2;i<= n;i++){
            dp[i] = dp[i-1] + dp[i-2];
        }
        return dp[n];

    }
}
