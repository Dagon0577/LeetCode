class Solution {
    public int numMatchingSubseq(String S, String[] words) {
        int res = 0;
        Map<String, Integer> wordMap = new HashMap<String, Integer>();
        for (String word : words) {
            if (!wordMap.containsKey(word)) {
                wordMap.put(word, 1);
            } else {
                wordMap.put(word, wordMap.get(word) + 1);
            }
        }
        for (String word : wordMap.keySet()) {
            res += wordMap.get(word) * (isSubSeq(S, word) ? 1 : 0);
        }
    }

    public boolean isSubSeq(String s, String word) {
        int index = -1;
        for (char single : word.toCharArray()) {
            index = s.indexOf(single, index + 1);
            if (index == -1)
                return false;
        }
        return true;
    }
}