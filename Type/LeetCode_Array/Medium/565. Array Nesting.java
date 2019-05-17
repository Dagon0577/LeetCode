class Solution {
    public int arrayNesting(int[] nums) {
        int result=0;
        for(int i=0; i< nums.length;i++){
            int temp=0;
            for(int j = i; nums[j] >= 0;temp++){
                int key = nums[j];
                nums[j] = -1;// nums[j] has done;
                j = key;
            }
            result = Integer.max(result,temp);
        }
        return result;
    }
}