import java.util.*;
public class Sol {
    
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[] arr = new int[n];
        
        for(int i=0; i<n; i++){
            arr[i] = scn.nextInt();
        }

        int x = scn.nextInt();
        scn.close();

        int fIdx = Fidx(arr, 0, x);
        System.out.println(fIdx);
    }

    public static int Fidx(int[] arr, int idx, int x){

        if(idx == arr.length) return -1;
        
        if(arr[idx] == x){
            return idx;
        } else{
            int fISA = Fidx(arr, idx+1, x); // first Idx SubArray..
            return fISA;
        }
    }
}
