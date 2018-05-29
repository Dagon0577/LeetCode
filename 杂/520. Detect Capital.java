class Solution {
    public boolean detectCapitalUse(String word) {        
        int gap=0;
        for(int i=0;i<word.length();i++){
            gap+='Z'-word.charAt(i)>=0?1:0;
        }
        return gap==0||gap==word.length()||(gap==1&&('Z'-word.charAt(0)>=0));
    }
}