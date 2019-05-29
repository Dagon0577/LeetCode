class Solution {
    public int[] constructArray(int n, int k) {
        int[] result = new int[n];
        int even = 1;
        int odd = k + 1;
        for (int i = 0; i <= k; i += 2) {
            result[i] = even++;
        }
        for (int i = 1; i <= k; i += 2) {
            result[i] = odd--;
        }
        for (int i = k + 1; i < n; ++i) {
            result[i] = i + 1;
        }
        return result;
    }
}