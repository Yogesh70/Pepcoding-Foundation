import java.util.*;

public class Sol {
    
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        scn.close();

        Pd(n);
    }

    public static void Pd(int n){

        if(n==0)  return;

        System.out.println(n);
        Pd(n-1);
    }
}
