class Solution {
    public int minTimeToVisitAllPoints(int[][] points) {
        int x0 = points[0][0], x1 = points[0][1];
        int ans = 0;
        for (int i = 1; i < points.length; ++i) {
            int y0 = points[i][0], y1 = points[i][1];
            ans += Math.max(Math.abs(x0 - y0), Math.abs(x1 - y1));
            x0 = y0;
            x1 = y1;
        }
        return ans;
    }
}