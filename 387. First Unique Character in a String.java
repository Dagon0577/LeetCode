class Solution {
    public int firstUniqChar(String s) {
        int[] key=new int[26];
        char[] ch=s.toCharArray();
        for(int i=0;i<ch.length;i++){
            key[ch[i]-'a']++;
        }
        for(int i=0;i<ch.length;i++){
            if(key[ch[i]-'a']==1)
                return i;
        }
        return -1;
    }
}