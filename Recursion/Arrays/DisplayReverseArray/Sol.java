import java.util.*;
public class Sol {
    
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[] arr = new int[n];
        
        for(int i=0; i<n; i++){
            arr[i] = scn.nextInt();
        }
        scn.close();

        DispRevArr(arr, 0);
    }

    public static void DispRevArr(int[] arr, int idx){

        if(idx == arr.length) return;
        DispRevArr(arr, idx+1);
        System.out.print(arr[idx] + " ");
    }
}
