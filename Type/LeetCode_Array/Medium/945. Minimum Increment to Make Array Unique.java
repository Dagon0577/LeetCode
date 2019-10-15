class Solution {
    public int minIncrementForUnique(int[] A) {
        if (A == null || A.length <= 1)
            return 0;
        int[] map = new int[40000];
        for (int a : A) {
            map[a]++;
        }
        int res = 0;
        int end = map.length - 1;
        for (int i = 0; i < end; i++) {
            if (map[i] > 1) {
                map[i + 1] += map[i] - 1;
                res += map[i] - 1;
            }
        }
        if (map[end] > 1)
            res += map[end] * (map[end] - 1) / 2;
        return res;
    }
}