class Solution {
    public int triangleNumber(int[] nums) {
        int len = nums.length;
        Arrays.sort(nums);
        int result = 0;
        for (int i = 0; i < len - 2; i++) {
            for (int j = i + 1; j < len - 1; j++) {
                int sum = nums[i] + nums[j];
                int k = j + 1;
                while (k < len && nums[k] < sum) {
                    result++;
                    k++;
                }
            }
        }
        return result;
    }
}