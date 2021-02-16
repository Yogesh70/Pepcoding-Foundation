import java.util.*;
public class Sol{

    public static int quickSelect(int[] arr,int lo,int hi,int k){

        int pIdx = partition(arr, arr[hi], lo, hi);

        if(k == pIdx){
            return arr[k];
        } else if(pIdx > k){
            int ans = quickSelect(arr, lo, pIdx-1, k);
            return ans;
        } else {
            int ans = quickSelect(arr, pIdx+1, hi, k);
            return ans;
        }
    }

    public static int partition(int[] arr,int pivot,int lo,int hi){
        System.out.println("pivot -> " + pivot);
        int i = lo, j = lo;
        while(j <= hi){
            if(arr[j] <= pivot){
                swap(arr, j, i);
                i++;
                j++;
            } else {
                j++;
            }
        }
        System.out.println("pivot index -> " + (i-1));
        return (j-1);
    }

    public static void swap(int[] arr,int i,int j){
        System.out.println("Swapping " + arr[i] + " and " + arr[j]);
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp; 
    }

    // public static void display(int[] arr){
    //     for(int i=0;i< arr.length;i++){
    //         System.out.println(arr[i]);
    //     }
    // }

    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[] arr = new int[n];

        for(int i=0;i< n;i++){
            arr[i] = scn.nextInt();
        }

        int k = scn.nextInt();
        scn.close();

        System.out.print(quickSelect(arr,0,arr.length-1,k-1));
    }
}