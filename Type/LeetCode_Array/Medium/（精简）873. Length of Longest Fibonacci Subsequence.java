class Solution {
    public int lenLongestFibSubseq(int[] A) {
        int n = A.length;
        int max = 0;
        int[][] dp = new int[n - 1][n];// new int[n][n]最后一行用不上。
        for (int i = 1; i < n; i++) {
            int l = 0, r = i - 1;
            while (l < r) {
                int sum = A[l] + A[r];
                if (sum > A[i]) {
                    r--;
                } else if (sum < A[i]) {
                    l++;
                } else {
                    dp[r][i] = dp[l][r] + 1;
                    max = Math.max(max, dp[r][i]);
                    r--;
                    l++;
                }
            }
        }
        return max == 0 ? 0 : max + 2;
    }
}