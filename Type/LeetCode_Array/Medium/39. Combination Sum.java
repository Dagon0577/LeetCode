class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        Arrays.sort(candidates);
        List<List<Integer>> result = new ArrayList<>();
        dfs(result, candidates, target, 0, new ArrayList<>());
        return result;
    }

    void dfs(List<List<Integer>> result, int[] g, int target, int pos, List<Integer> list) {
        if (target == 0) {
            result.add(new ArrayList<>(list));
            return;
        }
        if (pos == g.length) {
            return;
        }
        for (int i = pos; i < g.length; ++i) {
            if (target < g[i]) {
                break;
            }
            list.add(g[i]);
            dfs(result, g, target - g[i], i, list);
            list.remove(list.size() - 1);
        }
    }
}