import java.lang.reflect.Array;
import java.util.*;
public class Sol {
    
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int m = scn.nextInt();
        scn.close();

        ArrayList<String> list = getMazePaths(0,0,n-1,m-1);
        System.out.println(list);
    }

    public static ArrayList<String> getMazePaths(int sr, int sc, int dr, int dc){

        if(sr == dr && sc == dc){
            ArrayList<String> base = new ArrayList<>();
            base.add("");
            return base;
        }

        ArrayList<String> ans = new ArrayList<>();

        for(int jump=1; sc + jump <= dc; jump++){
            ArrayList<String> hCalls = getMazePaths(sr, sc+jump, dr, dc);

            for(int i=0;i< hCalls.size();i++){
                ans.add("h" + jump + hCalls.get(i));
            }
        }

        for(int jump=1; sr + jump <= dr; jump++){
            ArrayList<String> vCalls = getMazePaths(sr+jump, sc, dr, dc);

            for(int i=0;i< vCalls.size();i++){
                ans.add("v" + jump + vCalls.get(i));
            }
        }

        for(int jump=1; sr + jump <= dr && sc + jump <= dc; jump++){
            ArrayList<String> dCalls = getMazePaths(sr+jump, sc+jump, dr, dc);

            for(int i=0;i< dCalls.size();i++){
                ans.add("d" + jump + dCalls.get(i));
            }
        }

        return ans;
    }
}
