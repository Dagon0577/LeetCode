class Solution {
    public int[][] merge(int[][] intervals) {
        if (intervals.length == 0) {
            return intervals;
        }
        int n = intervals.length;
        int[] starts = new int[n];
        int[] ends = new int[n];
        for (int i = 0; i < n; i++) {
            starts[i] = intervals[i][0];
            ends[i] = intervals[i][1];
        }
        Arrays.sort(starts);
        Arrays.sort(ends);
        int start = starts[0];
        int i = 0, j = 0;
        int count = 0;
        List<int[]> list = new ArrayList<>();
        while (i < n || j < n) {
            if (i < n && starts[i] <= ends[j]) {
                count++;
                if (count == 1) {
                    start = starts[i];
                }
                i++;
            } else {
                count--;
                if (count == 0) {
                    list.add(new int[] { start, ends[j] });
                }
                j++;
            }
        }
        return list.toArray(new int[list.size()][]);
    }
}