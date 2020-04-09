class Solution {
    public String reverseWords(String s) {
        char[] c = s.toCharArray();
        int i = 0, j = 0;
        for (; j < c.length; j++) {
            if (c[j] == ' ')
                continue;
            // 单词往前移动后，最后一个单词是多余的，将其变为空格。
            if (i != 0)
                c[i++] = ' ';
            int start = i;
            // 将单词往前移动
            while (j < c.length && c[j] != ' ') {
                c[i++] = c[j++];
            }
            reverse(c, start, i - 1);
        }
        reverse(c, 0, i - 1);
        return new String(c, 0, i);
    }

    private void reverse(char[] c, int i, int j) {
        while (i < j) {
            char tmp = c[i];
            c[i] = c[j];
            c[j] = tmp;
            i++;
            j--;
        }
    }
}
/* api法
class Solution {
    public String reverseWords(String s) {
        String[] words = s.trim().split(" ");
        StringBuilder sb = new StringBuilder();
        for(int i = words.length - 1; i >= 0; i--){
            if(words[i].equals("")) continue;
            if(sb.length() > 0){
                sb.append(' ');
            }
            sb.append(words[i]);
        }
        return sb.toString();
    }
}

class Solution {
    public String reverseWords(String s) {
        // 除去开头和末尾的空白字符
        s = s.trim();
        // 正则匹配连续的空白字符作为分隔符分割
        List<String> wordList = Arrays.asList(s.split("\\s+"));
        Collections.reverse(wordList);
        return String.join(" ", wordList);
    }
}
*/