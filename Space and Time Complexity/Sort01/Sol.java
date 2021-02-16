import java.util.*;

public class Sol {

    public static void sort01(int[] arr){
        int i=0, j=0;
        
        while(j<arr.length){
            if(arr[j] == 1){
                j++;
            } else {
                swap(arr,j,i);
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

    public static void print(int[] arr){
        for(int i=0;i< arr.length;i++){
            System.out.println(arr[i]);
        } 
    }

    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[] arr = new int[n];

        for(int i=0;i< n;i++){
            arr[i] = scn.nextInt();
        }
        scn.close();

        sort01(arr);
        print(arr);
    }
    
}