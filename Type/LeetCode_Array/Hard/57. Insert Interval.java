class Solution {
    public int[][] insert(int[][] intervals, int[] newInterval) {
        List<int[]> res = new ArrayList<>();
        if (intervals.length == 0) {
            res.add(newInterval);
            return res.toArray(new int[1][]);
        }
        boolean isIn = false;
        boolean isOut = false;
        for (int[] i : intervals) {
            if (i[1] < newInterval[0]) {
                res.add(i);
            } else if (isOut) {
                res.add(i);
            } else {
                if (!isIn) {
                    if (i[0] > newInterval[1]) {
                        res.add(newInterval);
                        res.add(i);
                        isOut = true;
                    } else {
                        i[0] = Math.min(newInterval[0], i[0]);
                        i[1] = Math.max(newInterval[1], i[1]);
                        res.add(i);
                        isIn = true;
                    }
                } else {
                    int[] temp = res.get(res.size() - 1);
                    if (temp[1] < i[0]) {
                        res.add(i);
                        isOut = true;
                    } else {
                        temp[1] = Math.max(i[1], temp[1]);
                    }
                }
            }
        }
        if (res.get(res.size() - 1)[1] < newInterval[0]) {
            res.add(newInterval);
        }
        return res.toArray(new int[res.size()][]);
    }
}