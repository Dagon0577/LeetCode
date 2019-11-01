class Solution {
    public int minSubArrayLen(int s, int[] nums) {
        if (nums.length == 0) {
            return 0;
        }
        int sum = 0, i = 0, j = 0, result = Integer.MAX_VALUE;
        while (j < nums.length) {
            sum += nums[j];
            while (j >= i && sum >= s) {
                result = Math.min(result, j - i + 1);
                sum -= nums[i];
                i++;
            }
            j++;
        }
        if (result == Integer.MAX_VALUE) {
            return 0;
        }
        return result;
    }
}