import java.util.Scanner;

public class Sol {
    
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        int size = scn.nextInt();
        int[] arr = new int[size];

        for(int i=0; i<size; i++){
            arr[i] = scn.nextInt();
        }
        int x = scn.nextInt();
        scn.close();

        int[] indices = getIndices(arr,0,x,0);
        for(int i: indices){
            System.out.print(i + " ");
        }
    }

    public static int[] getIndices(int[] arr, int idx, int x, int count){
        if(idx == arr.length){
            int[] base = new int[count];
            return base;
        }

        if(arr[idx] == x){
            count++;
        }

        int[] rArray = getIndices(arr, idx+1, x, count);
        
        if(arr[idx] == x){
            rArray[count-1] = idx;
        }

        return rArray;
    }
}
