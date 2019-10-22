class Solution {
    public int maxWidthRamp(int[] A) {
        int l = 0, r = A.length - 1;
        int result = 0;
        for (int i = r; i >= 0; i--) {
            l = 0;
            while (A[l] > A[i]) {
                l++;
            }
            if (l < i) {
                result = Math.max(result, i - l);
            }
        }
        return result;
    }
}