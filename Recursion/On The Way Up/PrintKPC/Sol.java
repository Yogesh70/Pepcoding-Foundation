import java.util.*;
import java.io.*;

public class Sol {
    static String[] codes = {".;","abc","def","ghi","jkl","mno","pqrs","tu","vwx","yz"};
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        String str = scn.next();
        scn.close();

        printKPC(str,"");
    }

    public static void printKPC(String str,String ans){
        if(str.length() == 0){
            System.out.println(ans);
            return;
        }

        char ch = str.charAt(0);
        String ros = str.substring(1);

        String myCode = codes[ch - '0'];

        for(int i=0;i< myCode.length();i++){
            char myChar = myCode.charAt(i);
            printKPC(ros, ans + myChar);
        }
    }
}
