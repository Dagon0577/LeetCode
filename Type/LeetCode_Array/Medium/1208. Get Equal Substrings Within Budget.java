class Solution {
    public int equalSubstring(String s, String t, int maxCost) {
        char[] cs = s.toCharArray();
        char[] ct = t.toCharArray();
        int maxLen = 0;
        int cost = 0;
        int j = 0;
        for (int i = 0; i < cs.length; ++i) {
            cost += Math.abs(cs[i] - ct[i]);
            while (cost > maxCost) {
                cost -= Math.abs(cs[j] - ct[j]);
                j++;
            }
            maxLen = Math.max(maxLen, i - j + 1);
        }
        return maxLen;
    }
}