class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        backTracking(res, nums, 0, new ArrayList<>());
        return res;
    }

    private void backTracking(List<List<Integer>> res, int[] nums, int n, List<Integer> list) {
        res.add(new ArrayList<>(list));
        for (int i = n; i < nums.length; i++) {
            list.add(nums[i]);
            backTracking(res, nums, i + 1, list);
            list.remove(list.size() - 1);
        }
    }
}