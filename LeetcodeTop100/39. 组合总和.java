class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        Arrays.sort(candidates);
        List<List<Integer>> result = new ArrayList<>();
        dfs(result, candidates, target, 0, new ArrayList<>());
        return result;
    }

    private void dfs(List<List<Integer>> result, int[] candidates, int target, int pos, List<Integer> list) {
        if (target == 0) {
            result.add(new ArrayList<>(list));
            return;
        }
        if (pos == candidates.length) {
            return;
        }
        for (int i = pos; i < candidates.length; i++) {
            if (target < candidates[i]) {
                break;
            }
            list.add(candidates[i]);
            dfs(result, candidates, target - candidates[i], i, list);
            list.remove(list.size() - 1);
        }
    }
}