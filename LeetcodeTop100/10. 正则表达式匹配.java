class Solution {
    public boolean isMatch(String s, String p) {
        if (s == null || p == null) {
            return false;
        }
        boolean[][] dp = new boolean[s.length() + 1][p.length() + 1];
        dp[0][0] = true;// dp[i][j] 表示 s 的前 i 个是否能被 p 的前 j 个匹配
        for (int i = 1; i < p.length(); i++) {
            if (p.charAt(i) == '*' && dp[0][i - 1]) {
                dp[0][i + 1] = true;
            }
        }
        for (int i = 0; i < s.length(); i++) {
            for (int j = 0; j < p.length(); j++) {
                if (p.charAt(j) == '.' || p.charAt(j) == s.charAt(i)) {// 如果是任意元素 或者是对于元素匹配
                    dp[i + 1][j + 1] = dp[i][j];
                } else if (p.charAt(j) == '*') {
                    if (p.charAt(j - 1) != s.charAt(i) && p.charAt(j - 1) != '.') {// 如果前一个元素不匹配 且不为任意元素 没有匹配的情况
                        dp[i + 1][j + 1] = dp[i + 1][j - 1];
                    } else {
                        // dp[i + 1][j + 1] = (dp[i + 1][j] || dp[i][j + 1] || dp[i + 1][j - 1]);
                        dp[i + 1][j + 1] = (dp[i][j + 1] || dp[i + 1][j] || dp[i + 1][j - 1]);
                        /*
                         * dp[i][j] = dp[i-1][j] // 多个字符匹配的情况 
                         * or dp[i][j] = dp[i][j-1] // 单个字符匹配的情况 
                         * or dp[i][j] = dp[i][j-2] // 没有匹配的情况（虽然p.charAt(j - 1) == s.charAt(i)但是其实不能匹配，即为零个）
                         */
                    }
                }
            }
        }
        return dp[s.length()][p.length()];
    }
}