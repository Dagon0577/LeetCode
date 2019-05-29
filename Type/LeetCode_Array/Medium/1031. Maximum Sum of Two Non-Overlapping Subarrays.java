class Solution {
    public int maxSumTwoNoOverlap(int[] A, int L, int M) {
        int maxL = 0;
        int maxR = 0;
        int max = 0;
        for (int i = 0; i < A.length - L - M + 1; i++) {
            maxL = Math.max(maxL, maxSum(A, i, i + L - 1));
            max = Math.max(max, maxSum(A, i + L, i + L + M - 1) + maxL);
        }
        for (int i = 0; i < A.length - L - M + 1; i++) {
            maxR = Math.max(maxR, maxSum(A, i, i + M - 1));
            max = Math.max(max, maxSum(A, i + M, i + L + M - 1) + maxR);
        }
        return max;
    }

    public int maxSum(int[] A, int l, int r) {
        int sum = 0;
        for (; l <= r; l++) {
            sum += A[l];
        }
        return sum;
    }
}