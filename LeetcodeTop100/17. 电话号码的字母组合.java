/*递归
class Solution {

    String[] map = { " ", "*", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz" };

    List<String> result = new ArrayList<>();

    public List<String> letterCombinations(String digits) {
        if (digits == null || digits.length() == 0) {
            return result;
        }
        dfs(digits, "", 0);
        return result;
    }

    private void dfs(String str, String letter, int index) {
        if (index == str.length()) {
            result.add(letter);
            return;
        }

        char c = str.charAt(index);
        int pos = c - '0';
        String keyValue = map[pos];
        for (int i = 0; i < keyValue.length(); i++) {
            dfs(str, letter + keyValue.charAt(i), index + 1);
        }
    }
}
*/
class Solution {
    public List<String> letterCombinations(String digits) {
        List<String> result = new ArrayList<>();
        if (digits == null || digits.length() == 0) {
            return result;
        }
        String[] map = { "", "!@#", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz" };
        result.add("");
        for (int i = 0; i < digits.length(); i++) {
            String letters = map[digits.charAt(i) - '0'];
            int size = result.size();
            for (int j = 0; j < size; j++) {
                String tmp = result.remove(0);
                for (int k = 0; k < letters.length(); k++) {
                    result.add(tmp + letters.charAt(k));
                }
            }
        }
        return result;
    }
}