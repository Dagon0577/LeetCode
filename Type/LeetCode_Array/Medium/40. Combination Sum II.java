class Solution {
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        List<List<Integer>> res = new ArrayList<>();
        List<Integer> temp = new ArrayList<>();
        Arrays.sort(candidates);
        getCombination(res, candidates, temp, 0, target);
        return res;
    }

    private void getCombination(List<List<Integer>> list, int[] candidates, List<Integer> temp, int index, int target) {
        if (target == 0) {
            list.add(new ArrayList<>(temp));
            return;
        }
        for (int i = index; i < candidates.length; i++) {
            if (candidates[i] > target)
                return;
            if (i > index && can[i] == can[i - 1])
                continue;
            temp.add(candidates[i]);
            getCombination(list, candidates, temp, i + 1, target - candidates[i]);
            temp.remove(temp.size() - 1);
        }
    }
}