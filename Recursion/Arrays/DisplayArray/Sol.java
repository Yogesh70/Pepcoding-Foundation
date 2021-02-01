import java.util.*;
public class Sol {
    
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int [] arr = new int[n];
        for(int i=0; i<n; i++){
            arr[i] = scn.nextInt();
        }
        scn.close();
        DispArr(arr,0);
    }

    public static void DispArr(int[] arr, int idx){

        if(idx == arr.length)  return;
        System.out.print(arr[idx] + " ");
        DispArr(arr, idx+1);
    }
}
