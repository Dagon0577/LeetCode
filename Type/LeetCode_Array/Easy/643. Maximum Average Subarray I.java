class Solution {
    public double findMaxAverage(int[] nums, int k) {
       double sum = 0;
        double max = 0;
        for (int i = 0; i < k; ++i)
            sum += nums[i];
        max = sum;
        for (int i = k; i < nums.length; ++i) {
            sum = sum + nums[i] - nums[i-k];
            max = Math.max(sum, max);
        }
        return max*1.0/k;
    }
}