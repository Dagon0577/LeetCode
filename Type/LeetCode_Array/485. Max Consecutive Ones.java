class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        if(nums.length==1)
            return nums[0];
        int n=nums.length;
        int max=0;
        int num=0;
        for(int i=0;i<n;i++){
            if(nums[i]==1){
                num++;
            }
            else if(num!=0){
                max=Math.max(max, num);
                num=0;
            }

        }
        max=Math.max(max,num);
        return max;
    }
}