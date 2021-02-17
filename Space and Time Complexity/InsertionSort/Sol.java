import java.util.*;

public class Sol {
    
    public static void insertionSort(int[] arr){
        int n = arr.length;

        for(int itr=1;itr<= n-1;itr++){
            for(int i=itr;i> 0;i--){
                if(arr[i-1] > arr[i]){
                    swap(arr,i-1,i);
                } else {
                    break;
                }
            }
        }
    }

    public static void swap(int[]arr,int i,int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static void display(int[] arr){
        for(int i=0;i< arr.length;i++){
            System.out.print(arr[i] + " ");
        }
    }
    public static void main(String[]args){
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[]arr = new int[n];

        for(int i=0;i< n;i++){
            arr[i] = scn.nextInt();
        }
        scn.close();

        insertionSort(arr);
        display(arr);
    }
}
