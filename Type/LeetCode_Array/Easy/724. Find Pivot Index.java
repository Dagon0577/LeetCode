class Solution {
	public int pivotIndex(int[] nums) {
		int sum = 0;
		int leftSum = 0;
		for (int val : nums) {
			sum += val;
		}
		for (int i = 0; i < nums.length; i++) {
			if (leftSum == sum - leftSum - nums[i]) {
				return i;
			} else {
				leftSum += nums[i];
			}
		}
		return -1;
	}
}