import java.util.*;

public class Sol {
    
    public static void bubbleSort(int[] arr){
        int n = arr.length;

        for(int itr=0;itr< n-1;itr++){
            for(int j=0;j< n-itr-1;j++){
                if(arr[j+1] < arr[j]){
                    swap(arr,j+1,j);
                }
            }
        }
    }

    public static void swap(int[] arr,int i,int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static void display(int[] arr){
        for(int i : arr){
            System.out.print(i + " ");
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

        bubbleSort(arr);
        display(arr);
    }
}
