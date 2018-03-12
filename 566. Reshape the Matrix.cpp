class Solution {
    public int[][] matrixReshape(int[][] nums, int r, int c) {
        if(r*c>(nums.length*nums [0].length)){
            return nums;
        }
        else{
            int[][] array=new int[r][c];
            int row=0,columns=0;
            for(int i=0;i<nums.length;i++){
                for(int j=0;j<nums [0].length;j++){
                    array[row][columns]=nums[i][j];
                    //row+=(++columns)/c;
                    //columns=columns%c;
                    columns++;
                    if(columns == c){
					row++;
					columns = 0;
                    }
                }
            }
            return array;
        }
    }    
}