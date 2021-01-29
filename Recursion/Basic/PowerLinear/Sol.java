import java.util.*;

public class Sol {
    
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        int x = scn.nextInt();
        int n = scn.nextInt();
        scn.close();

        int rv = PowerLinear(x,n);
        System.out.println(rv);
    }

    public static int PowerLinear(int x, int n){
        if(n==1)  return x;

        int rRes = PowerLinear(x, n-1);
        int ans = x * rRes;
        return ans;
    }
}
