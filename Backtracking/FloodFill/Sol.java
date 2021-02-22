import java.util.*;

public class Sol {
    
    public static void main(String[]args){
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int m = scn.nextInt();
        int[][] maze = new int [n][m];
        
        for(int i=0;i< n;i++){
            for(int j=0;j< m;j++){
                maze[i][j] = scn.nextInt();
            }
        }
        scn.close();

        boolean[][] visited = new boolean[n][m];
        floodFill(maze,0,0,visited,"");
    }    

    public static void floodFill(int[][]maze,int r,int c,boolean[][] visited,String psf){

        if(r == maze.length-1 && c == maze[0].length-1){
            System.out.println(psf);
            return;
        }

        if(r < 0 || r >= maze.length || c < 0 || c >= maze[0].length || maze[r][c] == 1 || visited[r][c] == true){
            return;
        }

        visited[r][c] = true;

        floodFill(maze, r-1, c,visited, psf + "t");
        floodFill(maze, r, c-1,visited, psf + "l");
        floodFill(maze, r+1, c,visited, psf + "d");
        floodFill(maze, r, c+1,visited, psf + "r");

        visited[r][c] = false;
    }
}
