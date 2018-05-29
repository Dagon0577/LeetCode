class Solution {
    public int islandPerimeter(int[][] grid) {
        if (grid == null || grid.length == 0 || grid[0] == null || grid[0].length == 0) {return 0;}

        int row=grid.length;
        int col=grid[0].length;
        int sum=0;
        for(int i=0;i<row;i++)
            for(int j=0;j<col;j++)
            {
                if(grid[i][j]==1){
                    if(i==0 || grid[i-1][j]==0){
                        sum++;
                    }
                    if(i==row-1 || grid[i+1][j]==0){
                        sum++;
                    }
                    if(j==0 || grid[i][j-1]==0){
                        sum++;
                    }
                    if(j==col-1 || grid[i][j+1]==0){
                        sum++;
                    }
                }
            }
            return sum;
    }
}