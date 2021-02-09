import java.util.*;

public class Sol {
    
    static String[] codes = {".;","abc","def","ghi","jkl","mno","pqrs","tu","vwx","yz"};
    public static void main(String[] args){

        Scanner scn = new Scanner(System.in);
        String str = scn.next();
        scn.close();

        ArrayList<String> list = getKPC(str);
        System.out.print(list);
    }

    public static ArrayList<String> getKPC(String str){

        if(str.length() == 0){
            ArrayList<String> base = new ArrayList<>();
            base.add("");
            return base;
        }

        char ch = str.charAt(0);
        String rStr = str.substring(1);

        ArrayList<String> rRes = getKPC(rStr);
        ArrayList<String> ans = new ArrayList<>();

        String chCode = codes[ch - '0'];
        for(int i=0; i < chCode.length();i++){
            char myChar = chCode.charAt(i);
            for(int j=0; j< rRes.size();j++){
                ans.add(myChar + rRes.get(j));
            }
        }
        return ans;
    }
}