class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        if (nums.length < 3 || nums == null) {
            return result;
        }
        Arrays.sort(nums);
        int n = nums.length;
        for (int l1 = 0; l1 < n - 2; l1++) {
            if (nums[l1] > 0) {
                break;
            }
            if (l1 > 0 && nums[l1] == nums[l1 - 1]) {
                continue;
            }
            int l2 = l1 + 1, l3 = n - 1;
            while (l2 < l3) {
                int sum = nums[l1] + nums[l2] + nums[l3];
                if (sum == 0) {
                    List<Integer> temp = new ArrayList<>();
                    temp.add(nums[l1]);
                    temp.add(nums[l2]);
                    temp.add(nums[l3]);
                    result.add(temp);
                    while (l2 < l3 && nums[l2] == nums[++l2])
                        ;
                    while (l2 < l3 && nums[l3] == nums[--l3])
                        ;
                } else if (sum > 0) {
                    while (l2 < l3 && nums[l3] == nums[--l3])
                        ;
                } else {
                    while (l2 < l3 && nums[l2] == nums[++l2])
                        ;
                }
            }
        }
        return result;
    }
}