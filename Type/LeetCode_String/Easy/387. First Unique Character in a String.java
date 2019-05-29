class Solution {
    public int firstUniqChar(String s) {
        int resindex = s.length();
        if (resindex == 1)
            return 0;

        for (char c = 'a'; c <= 'z'; c++) {
            int index = s.indexOf(c);
            if (index != -1 && index == s.lastIndexOf(c))
                resindex = Math.min(resindex, index);
        }
        return resindex == s.length() ? -1 : resindex;

    }
}
// int[] key=new int[26];
// for(char c:s.toCharArray())
// key[c-'a']++;
// for(int i=0;i<s.length();i++)
// if(key[s.charAt(i)-'a']==1)
// return i;
// return -1;