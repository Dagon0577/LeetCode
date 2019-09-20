class Solution {
    public int maxScoreSightseeingPair(int[] A) {
        if (A.length == 0 || A == null) {
            return 0;
        }
        int result = 0;
        int max = A[0] + 0;
        for (int i = 1; i < A.length; ++i) {
            result = Math.max(result, max + A[i] - i);
            max = Math.max(max, A[i] + i);
        }
    }
}