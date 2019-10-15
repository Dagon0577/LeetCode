class Solution {
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        List<Integer> temp = new ArrayList<>();
        Arrays.sort(nums);
        dfs(res, nums, temp, 0);
        return res;
    }

    private void dfs(List<List<Integer>> list, int[] nums, List<Integer> temp, int index) {
        list.add(new ArrayList<>(temp));
        for (int i = index; i < nums.length; i++) {
            if (i > index && nums[i] == nums[i - 1])
                continue;
            temp.add(nums[i]);
            dfs(list, nums, temp, i + 1);
            temp.remove(temp.size() - 1);
        }
    }
}