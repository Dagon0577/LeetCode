class Solution {
    public int leastInterval(char[] tasks, int n) {
        int len = tasks.length;
        if (len < 1 || n < 0) {
            return 0;
        }
        int[] keys = new int[26];
        for (int i = 0; i < len; i++) {
            keys[tasks[i] - 'A']++;
        }
        Arrays.sort(keys);
        int maxCount = keys[25];
        int resultCount = (maxCount - 1) * (n + 1) + 1;
        // A->X->X ->A->X->X ->A
        // (A.size -1)*(n+1)+1
        int i = 24;
        while (i >= 0 && keys[i] == maxCount) {
            resultCount++;
            i--;
        }
        return Math.max(resultCount, len);
    }
}