class Solution {
    public String reverseString(String s) {
        char[] c = s.toCharArray();
        int len = c.length;
        for (int i = 0; i < len / 2; i++) {
            c[i] ^= c[len - i - 1];
            c[len - i - 1] ^= c[i];
            c[i] ^= c[len - i - 1];
        }
        return String.valueOf(c);
    }
}