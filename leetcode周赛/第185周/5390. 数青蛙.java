class Solution {
    public int minNumberOfFrogs(String croakOfFrogs) {
        int[] map = new int[5];
        int ans = 0;
        for (int i = 0; i < croakOfFrogs.length(); i++) {
            if (croakOfFrogs.charAt(i) == 'c') {
                map[0]++;
            } else if (croakOfFrogs.charAt(i) == 'r') {
                map[1]++;
            } else if (croakOfFrogs.charAt(i) == 'o') {
                map[2]++;
            } else if (croakOfFrogs.charAt(i) == 'a') {
                map[3]++;
            } else if (croakOfFrogs.charAt(i) == 'k') {
                map[4]++;
            } else {
                return -1;
            }
            if (map[1] > map[0] || map[2] > map[1] || map[3] > map[2] || map[4] > map[3]) {
                return -1;
            }
            ans = Math.max(ans, map[0]);
            if (map[4] == 1) {
                for (int j = 0; j < 5; j++) {
                    map[j] -= map[4];
                }
            }
        }
        if (map[0] != 0) {
            return -1;
        }
        return ans;
    }
}