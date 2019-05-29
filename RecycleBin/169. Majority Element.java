class Solution {
    public int majorityElement(int[] nums) {
      int key=nums[0];
      int t=1;
        for(int i=1;i<nums.length;i++){
            if(nums[i]==key){
                t++;  
            }
            else{
                if(t>0)
                    t--;
                else
                    key=nums[i];
            }
        }
        return key;
    }
}