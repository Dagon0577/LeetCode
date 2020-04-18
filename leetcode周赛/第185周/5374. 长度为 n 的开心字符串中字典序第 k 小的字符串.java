class Solution {
    public String getHappyString(int n, int k) {
        List<String> res = new ArrayList<>();
        dfs(n, "", res);
        if (res.size() < k) {
            return "";
        } else {
            return res.get(k - 1);
        }
    }

    private void dfs(int n, String s, List<String> res) {
        if (s.length() >= 2 && s.charAt(s.length() - 1) == s.charAt(s.length() - 2)) {
            return;
        }
        if (s.length() == n) {
            res.add(s);
            return;
        }
        dfs(n, s + "a", res);
        dfs(n, s + "b", res);
        dfs(n, s + "c", res);
    }
}