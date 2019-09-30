class Solution {
    public int lenLongestFibSubseq(int[] A) {
        int n = A.length;
        Map<Integer, Integer> index = new HashMap<>();
        for (int i = 0; i < n; ++i)
            index.put(A[i], i);

        Map<Integer, Integer> result = new HashMap<>();
        int ans = 0;

        for (int k = 0; k < n; ++k)
            for (int j = 0; j < k; ++j) {
                int i = index.getOrDefault(A[k] - A[j], -1);
                if (i >= 0 && i < j) {
                    // i * n 为了方便取结点(i,j)
                    int len = result.getOrDefault(i * n + j, 2) + 1;
                    result.put(j * n + k, len);
                    ans = ans > len ? ans : len;
                }
            }
        return ans;
    }
}