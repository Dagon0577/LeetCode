class Solution {
    public double largestTriangleArea(int[][] points) {
        
        
        int N = points.length;
        double area = 0;
        for (int i = 0; i < N; i++)
            for (int j = i+1; j < N; j++)
                for (int k = j+1; k < N; k++)
                    area = Math.max(area, area(points[i], points[j], points[k]));
        return area;
        
    }
     public double area(int[] P, int[] Q, int[] R) {
        return 0.5 * Math.abs(P[0]*Q[1] + Q[0]*R[1] + R[0]*P[1]-P[1]*Q[0] - Q[1]*R[0] - R[1]*P[0]);
    }
}