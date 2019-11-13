class Solution {
    public List<Integer> majorityElement(int[] nums) {
        if (nums.length < 1)
            return new ArrayList<>();
        int max1 = nums[0];
        int max2 = nums[0];
        int count1 = 0;
        int count2 = 0;
        List<Integer> result = new ArrayList<>();
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == max1) {
                count1++;
            } else if (nums[i] == max2) {
                count2++;
            } else if (count1 == 0) {
                max1 = nums[i];
                count1++;
            } else if (count2 == 0) {
                max2 = nums[i];
                count2++;
            } else {
                count1--;
                count2--;
            }
        }
        count1 = 0;
        count2 = 0;
        for (int i : nums) {
            if (i == max1)
                count1++;
            else if (i == max2)
                count2++;
        }
        if (count1 > nums.length / 3)
            result.add(max1);
        if (count2 > nums.length / 3)
            result.add(max2);
        return result;
    }
}