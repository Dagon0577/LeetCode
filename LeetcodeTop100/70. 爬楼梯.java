class Solution {
    public int climbStairs(int n) {
        if (n < 3) {
            return n;
        }
        int previous_1 = 2, previous_2 = 1, cur = 0;
        for (int i = 3; i <= n; i++) {
            cur = previous_1 + previous_2;
            previous_2 = previous_1;
            previous_1 = cur;
        }
        return cur;
    }
}