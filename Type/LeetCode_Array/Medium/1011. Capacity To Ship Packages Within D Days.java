class Solution {
    public int shipWithinDays(int[] weights, int D) {
        int max = 0;
        int sum = 0;
        for (int i = 0; i < weights.length; ++i) {
            if (max < weights[i]) {
                max = weights[i];
            }
            sum += weights[i];
        }
        int l = max, r = sum;
        while (l < r) {
            int m = l + (r - l) / 2;
            if (success(weights, m, D)) {
                r = m;
            } else {
                l = m + 1;
            }
        }
        return l;
    }

    private boolean success(int[] weights, int max, int D) {
        int j = 1;
        int sum = 0;
        for (int i = 0; i < weights.length; ++i) {
            if (sum + weights[i] <= max) {
                sum += weights[i];
            } else {
                j++;
                sum = weights[i];
            }
            if (j > D) {
                return false;
            }
        }
        return true;
    }
}