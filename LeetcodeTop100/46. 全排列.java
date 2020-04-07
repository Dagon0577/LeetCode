class Solution {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        int[] visited = new int[nums.length];
        dfs(result, nums, visited, new ArrayList<>());
        return result;
    }

    private void dfs(List<List<Integer>> result, int[] nums, int[] visited, List<Integer> list) {
        if (list.size() == nums.length) {
            result.add(new ArrayList<>(list));
            return;
        }
        for (int i = 0; i < nums.length; i++) {
            if (visited[i] == 1) {
                continue;
            }
            visited[i] = 1;
            list.add(nums[i]);
            dfs(result, nums, visited, list);
            visited[i] = 0;
            list.remove(list.size() - 1);
        }
    }
}