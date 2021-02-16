import java.util.*;

public class Sol {

    public static void partition(int[] arr,int pivot){

        int i=0, j=0;
        
        while(j<arr.length){
            if(arr[j] > pivot){
                j++;
            } else {
                swap(arr, j, i);
                i++;
                j++;
            }
        }
    }

    public static void swap(int[] arr,int i,int j){
        System.out.println("Swapping index " + i + " and index " + j);

        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static void display(int[] arr){
        for(int i : arr){
            System.out.println(i);
        }
    }

    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[] arr = new int[n];

        for(int i=0;i< n;i++){
            arr[i] = scn.nextInt();
        }
        int pivot = scn.nextInt();
        scn.close();

        partition(arr,pivot);
        display(arr);
    }
}
