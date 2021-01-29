import java.util.*;

public class Sol {
    
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        scn.close();

        Pdi(n);
    }

    public static void Pdi(int n){
    
        if(n==0)  return;
        
        System.out.println(n);
        Pdi(n-1);
        System.out.println(n);    
    }
}
