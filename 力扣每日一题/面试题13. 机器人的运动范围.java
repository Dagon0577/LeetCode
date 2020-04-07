class Solution {
    boolean[][] visited;

    public int movingCount(int m, int n, int k) {
        visited = new boolean[m][n];
        return dfs(0, 0, k);
    }

    public int dfs(int m, int n, int k) {
        if (m < 0 || n < 0 || m >= visited.length || n >= visited[0].length || getSum(m, n) > k || visited[m][n]) {
            return 0;
        }
        visited[m][n] = true;
        return 1 + dfs(m - 1, n, k) + dfs(m + 1, n, k) + dfs(m, n - 1, k) + dfs(m, n + 1, k);
    }

    public int getSum(int i, int j) {
        int sum = 0;
        while (i > 0) {
            sum += i % 10;
            i /= 10;
        }
        while (j > 0) {
            sum += j % 10;
            j /= 10;
        }
        return sum;
    }
}