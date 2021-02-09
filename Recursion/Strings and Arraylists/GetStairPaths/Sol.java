import java.util.*;
public class Sol {
    
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        scn.close();

        ArrayList<String> list = getStairPath(n);
        System.out.print(list);
    }

    public static ArrayList<String> getStairPath(int n){

        if(n == 0){
            ArrayList<String> base = new ArrayList<>();
            base.add("");
            return base;
        }

        if(n < 0) {
            ArrayList<String> base = new ArrayList<>();
            return base;
        }

        ArrayList<String> nm1To0 = getStairPath(n-1);
        ArrayList<String> nm2To0 = getStairPath(n-2);
        ArrayList<String> nm3To0 = getStairPath(n-3);

        ArrayList<String> nTo0 = new ArrayList<>();

        // n to 0 = n to n-1 (1 step) + n-1 to 0
        for(int i=0; i< nm1To0.size(); i++){
            nTo0.add("1" + nm1To0.get(i));
        }

        // n to 0 = n to n-2 (2 steps) + n-2 to 0
        for(int i=0; i< nm2To0.size(); i++){
            nTo0.add("2" + nm2To0.get(i));
        }
        
        // n to 0 = n to n-3 (3 steps) + n-3 to 0
        for(int i=0; i< nm3To0.size(); i++){
            nTo0.add("3" + nm3To0.get(i));
        }

        return nTo0;
    }
}
