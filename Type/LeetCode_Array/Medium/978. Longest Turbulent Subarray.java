class Solution {
    public int maxTurbulenceSize(int[] A) {
        if (A.length == 1)
            return 1;
        int max = 1;
        int preKey = 0;
        int count = 1;
        for (int i = 1; i < A.length; i++) {
            if (A[i] < A[i - 1]) {
                if (preKey == 1) {
                    count++;
                } else {
                    max = Math.max(max, count);
                    count = 2;
                }
                preKey = -1;
            } else if (A[i] > A[i - 1]) {
                if (preKey == -1) {
                    count++;
                } else {
                    max = Math.max(max, count);
                    count = 2;
                }
                preKey = 1;
            } else {
                max = Math.max(max, count);
                count = 1;
            }
        }
        return Math.max(max, count);
    }
}