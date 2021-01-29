import java.util.*;

public class Sol {
    
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        int x = scn.nextInt();
        int n = scn.nextInt();
        scn.close();

        int ans = Plog(x,n);
        System.out.println(ans);
    }

    public static int Plog(int x, int n){
        if(n == 1)  return x;

        int xrpnbt = Plog(x,n/2);
       
        // int xrpn = Plog(x,n/2) * Plog(x,n/2);  (Worst) worse than power linear..
        
        int xrpn = xrpnbt * xrpnbt;

        if(n % 2 == 1){
            xrpn = xrpn * x;
        }

        return xrpn;
    }
}
