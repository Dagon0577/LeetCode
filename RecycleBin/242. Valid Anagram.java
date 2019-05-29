class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length()!=t.length())
            return false;
        int[] letter=new int[26];
        for(char x:s.toCharArray())
            letter[x-'a']++;
        for(char y:t.toCharArray())
        {
             letter[y-'a']--;
            if(letter[y-'a']<0)
                return false;
        }
        return true;
    }
}