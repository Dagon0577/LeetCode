class Solution {
    public List<Integer> majorityElement(int[] nums) {
        int n = nums.length;
        List<Integer> result = new ArrayList<>();
        Arrays.sort(nums);
        for (int i = 0; i < n; i++) {
            int count = 1;
            for (int j = i + 1; j < n && nums[j] == nums[i]; j++) {
                count++;
            }
            if (count > n / 3) {
                result.add(nums[i]);
            }
            i += count - 1;
        }
        return reuslt;
    }
}