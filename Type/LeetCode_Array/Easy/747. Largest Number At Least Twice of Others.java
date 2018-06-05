class Solution {
    public int dominantIndex(int[] nums) {
        if(nums.length==1)
        return 0;
        int result=0;
        int max_1=nums[0];
        int max_2=Integer.MIN_VALUE;
        for(int i=1;i<nums.length;i++){
            if(nums[i]>max_1){
                max_2=max_1;
                max_1=nums[i];
                result=i;
            }
            else if(nums[i]>max_2){
                max_2=nums[i];
            }
        }
        if(max_1-max_2*2 >=0)
        return result;
        else return -1;
    }
}