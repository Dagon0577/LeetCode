class Solution {
    public List<String> stringMatching(String[] words) {
        Set<String> res = new HashSet<>();
        for (int i = 0; i < words.length; i++) {
            for (int j = 0; j < words.length; j++) {
                if (words[i].indexOf(words[j]) > -1 && i != j) {
                    res.add(words[j]);
                }
            }
        }
        return new ArrayList(res);
    }
}