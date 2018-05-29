class Solution {
    public int[][] floodFill(int[][] image, int sr, int sc, int newColor) {
        if(image[sr][sc]!=newColor)
         DFS(image,sr,sc,newColor,image[sr][sc]);
        return image;
    }
    private void DFS(int[][] image,int i,int j,int newColor,int key){
        
        if(i<0||image.length<=i||j<0||image[0].length<=j||image[i][j]!=key)
            return;
        image[i][j]=newColor;
        DFS(image,i,j-1,newColor,key);
        DFS(image,i,j+1,newColor,key);
        DFS(image,i-1,j,newColor,key);
        DFS(image,i+1,j,newColor,key);

    }
}