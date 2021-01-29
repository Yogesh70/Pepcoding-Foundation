import java.util.Scanner;

/**
 * Sol
 */
public class Sol {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        scn.close();

        int fact = factorial(n);
        System.out.println(fact);
    }

    public static int factorial(int n){
        if(n==0)  return 1;

        int rv = n * factorial(n-1);
        return rv;
    }
}