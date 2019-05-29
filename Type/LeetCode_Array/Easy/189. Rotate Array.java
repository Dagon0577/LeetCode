class Solution {
    public void rotate(int[] nums, int k) {
        k = k % nums.length;
        int[] tmp = new int[k];
        int t = nums.length - k;
        int s = t - 1;
        for (int i = 0; i < k; i++)
            tmp[i] = nums[t++];
        for (int i = nums.length - 1; i >= k; i--)
            nums[i] = nums[s--];
        for (int i = 0; i < k; i++)
            nums[i] = tmp[i];
    }
}