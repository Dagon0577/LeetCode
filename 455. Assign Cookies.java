class Solution {
    public int findContentChildren(int[] g, int[] s) {
        Arrays.sort(g);
        Arrays.sort(s);
        int i=0, j=0;
        int count = 0;
        for(; j<s.length && i<g.length; j++) {
            if(g[i] <= s[j]) {
                count ++;
                i++;
            }
        }

        return count;
    }
}