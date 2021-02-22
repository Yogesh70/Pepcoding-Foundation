import java.util.*;

public class Sol {
    public static void main(String[]args){
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[] arr = new int[n];
        
        for(int i=0;i< n;i++){
            arr[i] = scn.nextInt();
        }
        int target = scn.nextInt();
        scn.close();

        targetSumSubsets(arr,0,"",0,target);
    }

    public static void targetSumSubsets(int[]arr,int idx,String set,int sos,int target){

        if(sos > target){
            return;
        }

        if(idx == arr.length){
            if(sos == target){
                System.out.println(set + ".");
            }
            return;
        }

        // yes choice
        targetSumSubsets(arr,idx+1,set + arr[idx] + " ",sos + arr[idx],target);
        // no choice
        targetSumSubsets(arr, idx+1, set, sos, target);


    }
}
