import java.util.*;

public class Sol {
    
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int m = scn.nextInt();
        scn.close();

        printMazePath(0,0,n-1,m-1,"");
    }

    public static void printMazePath(int sr,int sc,int dr,int dc,String psf){

        if(sr == dr && sc == dc){
            System.out.println(psf);
            return;
        }

        if(sr < 0 || sc < 0 || sr > dr || sc > dc){
            return;
        }

        printMazePath(sr, sc+1, dr, dc, psf + "h");
        printMazePath(sr+1, sc, dr, dc, psf + "v");
    }
}
