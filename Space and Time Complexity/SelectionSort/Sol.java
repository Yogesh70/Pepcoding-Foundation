import java.util.Scanner;

public class Sol {
    
    public static void selectionSort(int[]arr){
        int n = arr.length;

        for(int itr=1;itr<= n-1;itr++){
            int i = itr-1;
            int min = i;

            for(int j=i+1;j< n;j++){
                if(arr[j] < arr[min]){
                    min = j;
                } 
            }
            swap(arr,min,i);
        }
    }
    
    public static void swap(int[]arr,int i,int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static void display(int[]arr){
        for(int i=0;i< arr.length;i++){
            System.out.print(arr[i] + " ");
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

        selectionSort(arr);
        display(arr);
    }

}
