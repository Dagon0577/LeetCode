class Solution {
    public int longestValidParentheses(String s) {
        int res = 0;
        int dp[] = new int[s.length()];
        for (int i = 1; i < s.length(); i++) {
            if (s.charAt(i) == ')') {
                if (s.charAt(i) == '(') {
                    dp[i] = (i >= 2 ? dp[i - 2] : 0) + 2;
                } else if (i - dp[i - 1] > 0 && s.charAt(i - dp[i - 1] - 1) == '(') {
                    // ((i - dp[i - 1]) >= 2 ? dp[i - dp[i - 1] - 2] : 0)即为求上面的情况。
                    dp[i] = dp[i - 1] + 2 + ((i - dp[i - 1]) >= 2 ? dp[i - dp[i - 1] - 2] : 0);
                    // 结果=前面已经存在的字符串S1+现在拼入的字符串+之前还可能存在的字符串s2。
                    // PS：s2与s1之间相隔了一个'('。
                }
                res = Math.max(res, dp[i]);
            }
        }
        return res;
    }
}