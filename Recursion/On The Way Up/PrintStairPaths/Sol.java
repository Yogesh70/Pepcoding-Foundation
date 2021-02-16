import java.util.*;

public class Sol {
    
    public static void main(String[]args){
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        scn.close();

        printStairPaths(n,"");
    }

    public static void printStairPaths(int n, String paths){
        if(n < 0){
            return;
        }

        if(n == 0){
            System.out.println(paths);
            return;
        }

        printStairPaths(n-1, paths + "1");
        printStairPaths(n-2, paths + "2");
        printStairPaths(n-3, paths + "3");
    }
}
