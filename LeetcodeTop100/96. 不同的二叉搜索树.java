class Solution {
    public int numTrees(int n) {
        int[] dp = new int[n + 1];
        dp[0] = 1;
        dp[1] = 1;
        for (int i = 2; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                dp[i] += dp[j - 1] * dp[i - j];
            }
        }
        return dp[n];
    }
}
/*
dp[n] = f(1) + f(2) + …… f(n);
f(j)为根节点为j的二叉搜索树，结果=左子树的种类数*右子树的种类数，即dp[j - 1]和dp[n - j]。
注意：dp[0] 为 1 即左子树或右子树为空的情况。
f(j) = dp[j - 1] * dp[n - j];
*/