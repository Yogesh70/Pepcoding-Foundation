// at n = 3   3 2 1 1 1 2 1 1 1 2 3 2 1 1 1 2 1 1 1 2 3

import java.util.*;

public class Sol {
    
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        scn.close();

        Printzz(n);
    }

    public static void Printzz(int n){
        if(n == 0)  return;

        System.out.print(n + " "); // Pre
        Printzz(n-1);
        System.out.print(n + " "); // In
        Printzz(n-1);
        System.out.print(n + " "); // Post
    }
}
