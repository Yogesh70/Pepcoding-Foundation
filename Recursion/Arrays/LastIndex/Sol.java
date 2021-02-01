import java.util.*;
public class Sol {
    
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        int size = scn.nextInt();
        int[] arr = new int[size];
        
        for(int i=0; i<size; i++){
            arr[i] = scn.nextInt();
        }

        int x = scn.nextInt();
        scn.close();

        int rv = Lidx(arr, 0, x);
        System.out.println(rv); 
    }

    public static int Lidx(int[] arr, int idx, int x){

        if(idx == arr.length) return -1;
        
        int lIdx = Lidx(arr, idx+1, x);

        if(lIdx != -1){
            return lIdx;
        } else if(arr[idx] == x) {
        return idx;
        } else {
            return -1;
        }
    }
}
