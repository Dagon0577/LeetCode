class Solution {
    public int jump(int[] nums) {
        int steps = 0, maxPosition = 0, end = 0;
        for (int i = 0; i < nums.length - 1; i++) {
            // 找到能跳的最远的
            maxPosition = Math.max(maxPosition, nums[i] + i);
            if (i == end) {// 遇到边界，更新边界，并且步数+1
                end = maxPosition;
                steps++;
            }
        }
        return steps;
    }
}