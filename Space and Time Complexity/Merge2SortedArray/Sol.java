import java.util.*;

public class Sol {
    
    public static void main(String[]args){
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[] arr1 = new int[n];

        for(int i=0;i< n;i++){
            arr1[i] = scn.nextInt();
        }

        int m = scn.nextInt();
        int[] arr2 = new int[m];

        for(int i=0;i< m;i++){
            arr2[i] = scn.nextInt();
        }
        scn.close();

        int [] ans = Merge2sortedArray(arr1,arr2);
        for(int i: ans){
            System.out.print(i + " ");
        }
    }

    public static int[] Merge2sortedArray(int[]a,int[]b){
        int n = a.length;
        int m = b.length;
        int[] mergedArr = new int[n+m];

        int i = 0;
        int j = 0;
        int k = 0;

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

        // if arr b ends
        while(i < n){
            mergedArr[k] = a[i];
            i++;
            k++;
        }

        // if arr a ends
        while(j < m){
            mergedArr[k] = b[j];
            j++;
            k++;
        }
        
        return mergedArr;
    }
}
