class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        int[] letter=new int[26];
        for(char c:magazine.toCharArray())
            letter[c-'a']++;
        for(char c:ransomNote.toCharArray()){
            letter[c-'a']--;
            if(letter[c-'a']<0)
                return false;
        }
        return true;

    }
}