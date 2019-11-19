class Solution {
    public int sumSubarrayMins(int[] a) {
        int[] leftBigger = new int[a.length];
        int[] rightBigger = new int[a.length];

        for (int i = 0; i < a.length; i++) {
            int leftCount = 1;
            for (int j = i - 1; j >= 0 && a[j] >= a[i]; ) {
                leftCount += leftBigger[j];
                j -= leftBigger[j];
            }
            leftBigger[i] = leftCount;
        }

        for (int i = a.length - 1; i >= 0; i--) {
            int rightCount = 1;
            for (int j = i + 1; j < a.length && a[j] > a[i]; ) {
                rightCount += rightBigger[j];
                j += rightBigger[j];
            }
            rightBigger[i] = rightCount;
        }
        int sum = 0;
        for (int i = 0; i < a.length; i++) {
            sum += (a[i] * leftBigger[i] * rightBigger[i]) % (1000000007);
            sum %= 1000000007;
        }

        return sum;
    }
}