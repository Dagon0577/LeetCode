class Solution {
    public int maxAreaOfIsland(int[][] grid) {
        int row=grid.length;
        int col=grid[0].length;
        int result=0;
        for(int i=0;i<row;i++)
            for(int j=0;j<col;j++){
                if(grid[i][j]==1)
                    result=Math.max(result, DFS(grid,i,j));
            }
        return result;
    }
    public int DFS(int[][]grid,int i,int j){
        if(i>=grid.length || j>=grid[0].length||i<0||j<0||grid[i][j]==0)
        return 0;
        grid[i][j]=0;        
        return 1+DFS(grid,i,j+1)+DFS(grid,i+1,j)+DFS(grid,i-1,j)+DFS(grid,i,j-1);   
    }    
}