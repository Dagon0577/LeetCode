class Solution {
    public int maxSubArray(int[] nums) {
        int curSum = nums[0], maxSum = nums[0];
        for (int i = 1; i < nums.length; i++) {
            curSum = Math.max(nums[i], curSum + nums[i]);
            maxSum = Math.max(curSum, maxSum);
        }
        return maxSum;
    }
}

/* DP 
class Solution {
    public int maxSubArray(int[] nums) {
        int maxSum = nums[0];
        for(int i = 1; i < nums.length; i++){
            if(nums[i - 1] > 0){
                nums[i] += nums[i - 1];
            }
            maxSum = Math.max(maxSum, nums[i]);
        }
        return maxSum;
    }
}
*/