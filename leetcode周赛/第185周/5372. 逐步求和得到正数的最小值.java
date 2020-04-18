class Solution {
    public int minStartValue(int[] nums) {
        int min = Integer.MAX_VALUE;
        int sum = 0;
        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];
            min = Math.min(min, sum);
        }
        if (min < 0) {
            return 1 - min;
        } else {
            return 1;
        }
    }
}