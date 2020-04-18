class Solution {
    public int numWays(int n, int[][] relation, int k) {
        int[][] dp = new int[k + 1][n];
        dp[0][0] = 1;
        for(int i = 0; i < k; i++){
            for(int[] r : relation){
                dp[i + 1][r[1]] += dp[i][r[0]];
            }
        }
        return dp[k][n - 1];
    }
}