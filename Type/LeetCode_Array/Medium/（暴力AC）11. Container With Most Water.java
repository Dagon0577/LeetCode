class Solution {
    public int maxArea(int[] height) {
        int N = height.length;
        int max = 0;
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                max = Math.max(max, (j - i + 1) * (height[j] > height[i] ? height[i] : height[j]));
            }
        }
        return max;
    }
}