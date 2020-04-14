class Solution {
    public int largestRectangleArea(int[] heights) {
        int res = 0;
        for(int i = 0; i < heights.length;i++){
            int minHeight = Integer.MAX_VALUE;
            for(int j = i; j < heights.length;j++){
                minHeight = Math.min(minHeight, heights[j]);
                res = Math.max(res,minHeight * (j - i + 1));
            }
        }
        return res;
    }
}