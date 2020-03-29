class Solution {
    public List<String> generateParenthesis(int n) {
        List<String> res = new ArrayList<>();
        backTracking(res, "", 0, 0, n);
        return res;
    }

    private void backTracking(List<String> res, String cur, int left, int right, int n) {
        if (cur.length() == n * 2) {
            res.add(cur);
            return;
        }

        if (left < n) {
            backTracking(res, cur + "(", left + 1, right, n);
        }
        if (right < left) {
            backTracking(res, cur + ")", left, right + 1, n);
        }
    }
}