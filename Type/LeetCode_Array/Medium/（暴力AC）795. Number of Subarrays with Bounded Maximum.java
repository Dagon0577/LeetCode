class Solution {
    public int numSubarrayBoundedMax(int[] A, int L, int R) {
        int len = A.length, result = 0, preIndex = 0;
        for (int i = 0; i < len; i++) {
            if (A[i] >= L && A[i] <= R) {
                int j = i - 1;
                if (preIndex < i) {
                    while (j >= preIndex && A[j] < L) {
                        j--;
                    }
                    result += (i - j - 1);
                    preIndex = i;
                }
                result++;// 自身
                int k = i + 1;
                while (k < len && A[k] <= R) {
                    k++;
                }
                result += (k - i - 1);
                result += (i - j - 1) * (k - i - 1);
            }
        }
        return result;
    }
}