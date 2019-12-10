class Solution {
    public int findMinDifference(List<String> timePoints) {
        if (timePoints.size() > 1440) {
            return 0;
        }
        int[] map = new int[1440];
        for (int i = 0; i < timePoints.size(); ++i) {
            String timeStr = timePoints.get(i);
            int time = Integer.parseInt(timeStr.substring(0, 2)) * 60 + Integer.parseInt(timeStr.substring(3));
            if (map[time] == 1) {
                return 0;
            }
            map[time]++;
        }
        int mindiff = 1440, pre = -1, first = -1;
        for (int i = 0; i < map.length; ++i) {
            if (map[i] == 1) {
                if (pre != -1) {
                    mindiff = Math.min(mindiff, i - pre);
                } else {
                    first = i;
                }
                pre = i;
            }
        }
        mindiff = Math.min(mindiff, 1440 - pre + first);
        return mindiff;
    }
}