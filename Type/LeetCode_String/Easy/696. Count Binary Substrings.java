class Solution {
    public int countBinarySubstrings(String s) {
        int curr = 1, prev = 0, count = 0;
        char[] c = s.toCharArray();
        for (int i = 1; i < c.length; i++) {
            if (c[i] != c[i - 1]) {
                count += Math.min(prev, curr);
                prev = curr;
                curr = 1;
            } else
                curr++;
        }
        return count + Math.min(prev, curr);
    }
}