import java.util.*;
public class Sol {
    public static void main(String[]args){
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int m = scn.nextInt();
        int[][]maze = new int[n][m];
        
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                maze[i][j] = scn.nextInt();
            }
        }
        scn.close();

        // int minCost = minCostMaze(maze,0,0);
        // int minCost = minCostMazeMemo(maze,0,0,new int[n][m]);
        int minCost = minCostMazeTab(maze);
        System.out.println(minCost);
    }

    public static int minCostMaze(int[][]maze,int sr,int sc){
        if(sr == maze.length-1 && sc == maze[0].length-1){
            return maze[sr][sc];
        }

        if(sr >= maze.length || sc >= maze[0].length){
            return Integer.MAX_VALUE;
        }

        int hCost = minCostMaze(maze, sr, sc+1);
        int vCost = minCostMaze(maze,sr+1,sc);

        int ans = Math.min(hCost,vCost) + maze[sr][sc];
        return ans;
    }

    public static int minCostMazeMemo(int[][]maze,int sr,int sc,int[][]qb){

        if(sr == maze.length-1 && sc == maze[0].length-1){
            return maze[sr][sc];
        }

        if(sr >= maze.length || sc >= maze[0].length){
            return Integer.MAX_VALUE;
        }

        if(qb[sr][sc] != 0){
            return qb[sr][sc];
        }

        int hCost = minCostMazeMemo(maze,sr,sc+1,qb);
        int vCost = minCostMazeMemo(maze,sr+1,sc,qb);

        int ans = Math.min(hCost,vCost) + maze[sr][sc];
        qb[sr][sc] = ans;
        return ans;
    }

    public static int minCostMazeTab(int[][]maze){
        int n = maze.length;
        int m = maze[0].length;

        int[][] dp = new int[n][m];

        // dp[i][j] -> i,j to dest Min Cost

        for(int i=n-1;i >= 0;i--){
            for(int j=m-1;j >= 0;j--){

                if(i == n-1 && j == m-1){
                    dp[i][j] = maze[i][j];
                }

                else if(i == n-1){
                    dp[i][j] = dp[i][j+1] + maze[i][j];
                } 

                else if(j == m-1){
                    dp[i][j] = dp[i+1][j] + maze[i][j];
                }

                else{
                    dp[i][j] = Math.min(dp[i][j+1],dp[i+1][j]) + maze[i][j];
                }
            }
        }

        return dp[0][0];
    }
}
 