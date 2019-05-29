import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

class Solution {
    public String mostCommonWord(String paragraph, String[] banned) {
        paragraph += ".";

        Set<String> banset = new HashSet<>();
        for (String word : banned)
            banset.add(word);
        Map<String, Integer> count = new HashMap();

        String ans = "";
        int ansLine = 0;

        StringBuilder word = new StringBuilder();
        for (char c : paragraph.toCharArray())
            if (Character.isLetter(c)) {
                word.append(Character.toLowerCase(c));
            } else if (word.length() > 0) {
                String trueWord = word.toString();
                if (!banset.contains(trueWord)) {
                    count.put(trueWord, count.getOrDefault(trueWord, 0) + 1);
                    if (count.get(trueWord) > ansLine) {
                        ans = trueWord;
                        ansLine = count.get(trueWord);
                    }
                }
                word = new StringBuilder();
            }

        return ans;
    }
}