class Solution {
    public int maxProduct(int[] nums) {
        int N = nums.length;
        int[][] dp = new int[N][2];
        // for (int i = 0; i < N; i++) 
        //     dp[i] = new int[2];

        /**
         * dp状态定义
         * dp[i][0] 表示start为任意值, end为i的所有子序列的最大值
         * dp[i][1] 表示start为任意值, end为i的所有子序列的最小值
         */

        /**
         * dp 方程
         * dp[i][0]= nums[i]>=0?
         * max(nums[i]*dp[i-1][0],nums[i]):
         * max(nums[i]*dp[i-1][1],nums[i])
         *
         * dp[i][1]= nums[i]>=0?
         * min(nums[i]*dp[i-1][1],nums[i]):
         * min(nums[i]*dp[i-1][0],nums[i])
         */

        dp[0][0] = nums[0];
        dp[0][1] = nums[0];
        int max = nums[0];

        for (int i = 1; i < N; i++) {
            dp[i][0] = nums[i] >= 0 ?
                    Math.max(nums[i] * dp[i - 1][0], nums[i]) :
                    Math.max(nums[i] * dp[i - 1][1], nums[i]);

            dp[i][1] = nums[i] >= 0 ?
                    Math.min(nums[i] * dp[i - 1][1], nums[i]) :
                    Math.min(nums[i] * dp[i - 1][0], nums[i]);

            max = Math.max(dp[i][0], max);
        }
        return max;

    }
}