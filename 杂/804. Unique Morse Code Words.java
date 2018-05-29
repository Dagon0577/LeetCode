
class Solution {
    public int uniqueMorseRepresentations(String[] words) {
        String[] MORSE = new String[]{".-","-...","-.-.","-..",".","..-.","--.",
                         "....","..",".---","-.-",".-..","--","-.",
                         "---",".--.","--.-",".-.","...","-","..-",
                         "...-",".--","-..-","-.--","--.."};
 
        Set<String> result=new HashSet();
        for(String word:words){
            StringBuilder code=new StringBuilder();
            for(char c:word.toCharArray())
                code.append(MORSE[c-'a']);
            result.add(code.toString());
        }
        return result.size();
    }
}