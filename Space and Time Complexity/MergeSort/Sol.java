import java.util.*;

public class Sol {
    
    public static int[] mergeSort(int[] arr,int lo,int hi){
        if(lo == hi){
            int[] ba = new int[1];
            ba[0] = arr[lo];
            return ba;
        }

        int pivotIdx = (lo + hi)/2;

        int[] lHalf = mergeSort(arr, lo, pivotIdx);
        int[] rHalf = mergeSort(arr,pivotIdx+1,hi);
        int[] msa = merge2sortedArray(lHalf, rHalf);

        return msa;
    }

    public static int[] merge2sortedArray(int[]a,int[]b){

        int n = a.length;
        int m = b.length;
        int[] mergedArr = new int[n+m];
        
        int i=0;
        int j=0;
        int k=0;

        while(i < n && j < m){
            if(a[i] < b[j]){
                mergedArr[k] = a[i];
                i++;
                k++;
            } else {
                mergedArr[k] = b[j];
                j++;
                k++;
            }
        }

        while(i < n){
            mergedArr[k] = a[i];
            i++;
            k++;
        }

        while(j < m){
            mergedArr[k] = b[j];
            j++;
            k++;
        }
        return mergedArr;
    }

    public static void display(int[] arr){
        for(int i=0;i< arr.length;i++){
            System.out.print(arr[i] + " ");
        }
    }
    public static void main(String[]args){
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[] arr = new int[n];

        for(int i=0;i< n;i++){
            arr[i] = scn.nextInt();
        }

        scn.close();

        int[] sortedArr = mergeSort(arr,0,arr.length-1);
        display(sortedArr);
    } 
}
