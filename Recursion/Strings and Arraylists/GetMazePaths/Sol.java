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

        if(sr < 0 || sc < 0 || sr > dr || sc > dc){
            return new ArrayList<>();
        }

        // horiz to dest -> (0,1) to (2,2)
        ArrayList<String> hCalls = getMazePaths(sr, sc+1, dr, dc);

        // verti to dest -> (1,0) to (2,2)
        ArrayList<String> vCalls = getMazePaths(sr+1, sc, dr, dc);

        ArrayList<String> rl = new ArrayList<>();

        // src to dest = "h" + horiz to dest
        // (0,0) to (2,2) = "h" + (0,1) to (2,2)
        for(int i=0;i< hCalls.size();i++){
            rl.add("h" + hCalls.get(i));
        }

        // src to dest = "v" + vert to dest
        // (0,0) to (2,2) = "v" + (1,0) to (2,2)
        for(int i=0;i< vCalls.size();i++){
            rl.add("v" + vCalls.get(i));
        }

        return rl;
    }
}
