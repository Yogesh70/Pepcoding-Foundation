import java.util.*;

public class Sol {
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        String str = scn.next();
        scn.close();

        ArrayList<String> list = getSS(str);
        System.out.print(list);
    }

    public static ArrayList<String> getSS(String str){

        if(str.length() == 0){
            ArrayList<String> base = new ArrayList<>();
            base.add("");
            return base;
        }

        char ch = str.charAt(0);
        String rStr = str.substring(1);

        ArrayList<String> rRes= getSS(rStr);
        ArrayList<String> ans = new ArrayList<>();

        for(int i=0; i < rRes.size(); i++){
            ans.add(rRes.get(i));
        }

        for(int i=0; i < rRes.size(); i++){
            ans.add(ch + rRes.get(i));
        }
        return ans;
    }
}
