class Solution {
    public List<List<Integer>> fourSum(int[] nums, int target) {
        List<List<Integer>> result = new ArrayList<>();
        Arrays.sort(nums);
        for (int i = 0; i <= nums.length - 4; i++) {
            int i1 = i + 1, i3 = nums.length - 1, i2 = i3 - 1;
            while (i1 < i2 && i3 >= 3) {
                // 当前四个数的和小于targer
                if (nums[i] + nums[i1] + nums[i2] + nums[i3] < target) {
                    // 将i2位置返回，增大i1
                    if (i2 == i1 + 1) {
                        i2 = i3 - 1;
                    }
                    i1++;
                } else if (nums[i] + nums[i1] + nums[i2] + nums[i3] > target) {
                    // 将i1、i2的位置返回，减小i3
                    if (i2 == i1 + 1) {
                        i3--;
                        i2 = i3 - 1;
                        i1 = i + 1;
                    } else {
                        // 减小i2
                        i2--;
                    }
                } else if (nums[i] + nums[i1] + nums[i2] + nums[i3] == target) {
                    List<Integer> list = new ArrayList<>();
                    list.add(nums[i]);
                    list.add(nums[i1]);
                    list.add(nums[i2]);
                    list.add(nums[i3]);
                    if (!result.contains(list)) {
                        result.add(list);
                    }
                    i1++;
                    i2 = i3 - 1;
                }
            }
        }
        return result;
    }
}