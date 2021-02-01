import java.util.*;
public class Sol {
    
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        int size = scn.nextInt();
        int[] arr = new int[size];

        for(int i=0; i<size; i++){
            arr[i] = scn.nextInt();
        }

        int max = ArrMax(arr,0);
        System.out.print(max);
    }

    public static int ArrMax(int[] arr, int idx){

        if(idx == arr.length - 1) return arr[idx];
        
        int subMax = ArrMax(arr, idx+1);
        if(subMax < arr[idx]){
            return arr[idx];
        } else {
            return subMax;
        }
    }
}
