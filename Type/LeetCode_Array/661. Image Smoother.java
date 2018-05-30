class Solution {
    public int[][] imageSmoother(int[][] M) {
       int row=M.length,col=M[0].length;
       int[][] result=new int[row][col];
       for(int i=0;i<row;i++)
        for(int j=0;j<col;j++){
            int count=0;
            for(int n=i-1;n<=i+1;n++)
                for(int m=j-1;m<=j+1;m++){
                    if(n>=0 && n<row && m>=0 &&m<col){
                        result[i][j]+=M[n][m];
                        count++;
                    }
                }
                result[i][j]/=count;
        }
        return result;
    }
}