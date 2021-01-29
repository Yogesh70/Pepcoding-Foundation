import java.util.*;

public class Sol {
    
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        scn.close();

        Pi(n);
    }

    public static void Pi(int n){

        if(n==0) return;
        Pi(n-1);
        System.out.println(n);
    }
}
