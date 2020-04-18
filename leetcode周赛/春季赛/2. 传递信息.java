class Solution {
    public int numWays(int n, int[][] relation, int k) {
        int[][] dp = new int[k + 1][n + 1];
        for(int i = 0;i < relation.length;i++){
            if(relation[i][0] == 0){
                dp[1][relation[i][1]] = 1;
            }
        }
        for(int i = 2; i <=k; i++){
            for(int j = 0;j < n; j++){
                for(int l = 0; l < relation.length; l++){
                    if(relation[l][1] == j){
                        dp[i][j] += dp[i - 1][relation[l][0]];
                    }
                }
            }
        }
        return dp[k][n - 1];
    }
}