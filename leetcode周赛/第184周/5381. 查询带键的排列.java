class Solution {
    public int[] processQueries(int[] queries, int m) {
        int n = queries.length;
        int[] res = new int[n];
        int[] P = new int[m];
        for (int i = 0; i < m; i++) {
            P[i] = i + 1;
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (P[j] == queries[i]) {
                    res[i] = j;
                    sort(P, 0, j);
                    break;
                }
            }
        }
        return res;
    }

    private void sort(int[] list, int start, int end) {
        int tmp = list[end];
        for (int i = end; i > start; i--) {
            list[i] = list[i - 1];
        }
        list[start] = tmp;
    }
}