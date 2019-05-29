class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int n=0;
        int t=0,k=0;
        if(nums.length==1)return nums[0];
        while(k<nums.length-1&&nums[k]!=1){
            k++;
        }
        while(k<nums.length){
            if(nums[k]==1){
                t++;
            }else{
                t=0;
            }
            if(n<t)n=t;
            k++;
        }
        return n;
    }
}