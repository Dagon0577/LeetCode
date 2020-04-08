class Solution {
    public int maxSubarraySumCircular(int[] A) {
        int S = 0;
        for (int x : A) {
            S += x;
        }
        if (A.length == 1) {
            return A[0];
        }
        int ans1 = kadane(A, 0, A.length - 1, 1);
        int ans2 = S + kadane(A, 0, A.length - 2, -1);
        // int ans3 = S + kadane(A, 0, A.length - 2, -1);
        return Math.max(ans1, ans2);
    }

    public int kadane(int[] A, int i, int j, int sign) {
        int ans = Integer.MIN_VALUE;
        int cur = Integer.MIN_VALUE;
        for (int k = i; k <= j; k++) {
            cur = sign * A[k] + Math.max(cur, 0);
            ans = Math.max(ans, cur);
        }
        return ans;
    }
}