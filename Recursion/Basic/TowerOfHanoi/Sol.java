import java.util.*;

public class Sol {
    
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        scn.close();
        TOH(n,'A','B','C');
    }

    public static void TOH(int n, char src, char help, char dest){

        if(n==0)  return;

        TOH(n-1,src,dest,help);
        System.out.println("Move disk " + n + " from " + src + " to " + dest);
        TOH(n-1,help, src, dest);
    }
}
