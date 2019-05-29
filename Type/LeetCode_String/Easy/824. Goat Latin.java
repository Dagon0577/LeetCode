class Solution {
    public String toGoatLatin(String S) {
        StringBuilder result = new StringBuilder();
        String[] words = S.split(" ");
        char[] map = new char[256];
        map['a'] = map['e'] = map['i'] = map['o'] = map['u'] = map['A'] = map['E'] = map['I'] = map['O'] = map['U'] = 1;
        StringBuilder splice = new StringBuilder("a");
        for (int i = 0; i < words.length; i++) {
            if (map[words[i].charAt(0)] == 1) {
                result.append(words[i]).append("ma");
            } else {
                result.append(words[i].substring(1)).append(words[i].charAt(0)).append("ma");
            }
            result.append(splice);
            splice.append("a");
            if (i != word.length - 1)
                result.append(" ");
        }
        return result.toString();

    }
}
