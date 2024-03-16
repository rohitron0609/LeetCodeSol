package in.decx.train.Problems;

public class NumberOfIslands {
    public int allIslands(char[][] grid){
        if(grid.length == 0 || grid[0].length == 0) return 0;

        int count = 0;
        for(int i = 0; i < grid.length; i++){
            for(int j = 0; j < grid[0].length; j++){
                if(grid[i][j] == '1'){
                    count++;
                    helper(grid, i ,j);
                }
            }
        }
        return count;
    }
    public void helper(char[][] grid, int i, int j){
        if( i < 0 || j < 0 || i >= grid.length || j >= grid[0].length || grid[i][j] == '0')
            return;
        grid[i][j] = 0;
        helper(grid, i+1, j);
        helper(grid, i-1, j);
        helper(grid, i, j+1);
        helper(grid, i, j-1);
    }
}
