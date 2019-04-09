package leetcode_amazon;

public class Q200_NumberofIslands {
    public static void dfs(char[][] grid, int r, int c){
        int nr = grid.length;
        int nc = grid[0].length;

        if (r < 0 || c <0 || r >= nr|| c >= nc || grid[r][c] == 0) return;
        grid[r][c] = 0;
        dfs(grid,r-1,c);
        dfs(grid,r+1,c);
        dfs(grid,r,c-1);
        dfs(grid,r,c+1);
        return;
    }

    public static int numIslands(char[][] grid){
        if (grid == null || grid.length == 0) return 0;
        int nr = grid.length;
        int nc = grid[0].length;
        int count = 0;
        for(int r = 0 ; r < nr;r++){
            for (int c = 0;c<nc;c++){
                if (grid[r][c] == 1){
                    count++;
                    dfs(grid,r,c);
                }
            }
        }
        return count;
    }

    public static void main(String[] args) {
        System.out.println(numIslands(new char[][]{{1,1,1,1,0},{1,1,0,1,0},{1,1,0,0,0},{0,0,0,0,0}}));
    }
}
