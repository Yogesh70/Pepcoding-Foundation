import java.util.*;
import java.io.*;

public class Sol {
    
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String str = scn.next();
        scn.close();
        
        printPermutations(str,"");
    }

    public static void printPermutations(String str,String ans){
        
        if(str.length() == 0){
            System.out.println(ans);
            return;
        }
        
        for(int i=0;i< str.length();i++){
            char ch = str.charAt(i);
            String left = str.substring(0,i);
            String right = str.substring(i+1);
            String remStr = left + right;
            printPermutations(remStr, ans + ch);
        }
    }
}
