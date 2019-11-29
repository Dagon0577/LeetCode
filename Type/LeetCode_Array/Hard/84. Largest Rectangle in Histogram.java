class Solution {
    public int largestRectangleArea(int[] heights) {
        Stack<Integer> stack = new Stack<>();
        int maxarea = 0;

        for (int i = 0; i < heights.length; ++i) {
            while (!stack.isEmpty() && heights[stack.peek()] >= heights[i]) {
                // 计算以弹出元素为高，与当前i之间构成的最大面积（i-1是因为heights[i]的高必定小于弹出元素）
                maxarea = Math.max(maxarea, heights[stack.pop()] * (stack.isEmpty() ? i : (i - 1 - stack.peek())));
            }
            stack.push(i);
        }
        while (!stack.isEmpty()) {
            maxarea = Math.max(maxarea,
                    heights[stack.pop()] * (stack.isEmpty() ? heights.length : (heights.length - 1 - stack.peek())));
        }
        return maxarea;
    }
}