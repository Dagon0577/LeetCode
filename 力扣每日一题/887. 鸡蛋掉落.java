class Solution {
    /**
        * 鸡蛋掉落，鹰蛋（Leetcode 887）：（经典dp）
        * 有 K 个鸡蛋，有 N 层楼，用最少的操作次数 F 检查出鸡蛋的质量。
        *
        * 思路：
        * 本题应该逆向思维，若你有 K 个鸡蛋，你最多操作 F 次，求 N 最大值。
        *
        * dp[k][f] = dp[k][f-1] + dp[k-1][f-1] + 1;
        * 解释：
        * 0.dp[k][f]：如果你还剩 k 个蛋，且只能操作 f 次了，所能确定的楼层。
        * 1.dp[k][f-1]：蛋没碎，因此该部分决定了所操作楼层的上面所能容纳的楼层最大值
        * 2.dp[k-1][f-1]：蛋碎了，因此该部分决定了所操作楼层的下面所能容纳的楼层最大值
        * 又因为第 f 次操作结果只和第 f-1 次操作结果相关，因此可以只用一维数组。
        *
        * 时复：O(K*根号(N))
        */
       public int superEggDrop(int K, int N) {
           int[] dp = new int[K + 1];
           int ans = 0;    // 操作的次数
           while (dp[K] < N){
               for (int i = K; i > 0; i--) // 从后往前计算
                   dp[i] = dp[i] + dp[i-1] + 1;
               ans++;
           }
           return ans;
       }
   }
/*
class Solution {
    public int superEggDrop(int K, int N) {
        int[][] dp = new int[K + 1][N + 1];
        int m = 0;
        while(dp[K][m] < N){
            m++;
            for(int k = 1; k <= K; k++){
                dp[k][m] = dp[k][m - 1] +dp[k - 1][m - 1] + 1;
            }
        }
        return m;
    }
}

class Solution {
    private Integer[][] memo;
    public int superEggDrop(int K, int N) {
        if(K == 1) return N;
        if(N == 1) return 1;
        if(memo == null) memo = new Integer[K+1][N+1];
        if(memo[K][N] != null) return memo[K][N];   
        int ans = N, lo = 1, hi = N + 1;
        while(lo < hi) {
            int m = lo + (hi - lo) / 2;
            int left = superEggDrop(K-1, m-1); // 递增函数
            int right = superEggDrop(K, N-m);  // 递减函数
            // 寻找一个m使得left和right尽可能的接近，才能使得max最小
            ans = Math.min(ans, Math.max(left, right) + 1);
            if(left < right) {
                lo = m + 1;
            } else if(left > right)
                hi = m;
            else break;
        }
        return memo[K][N] = ans;
    }
}
*/