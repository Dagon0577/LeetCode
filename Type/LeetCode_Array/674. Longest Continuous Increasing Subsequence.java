class Solution {
    public int findLengthOfLCIS(int[] nums) {
        int len=nums.length;
        if(len==1)
        return 1;
        int num=1;
        int result=1;
        for(int i=1;i<len;i++){
            if(nums[i]>nums[i-1])
            num++;
            else{
                result=Math.max(result,num);
                num=1;
            }

        }
        result=Math.max(result,num);
        return result;
    }
}