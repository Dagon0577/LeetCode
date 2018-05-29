class Solution {
    public int majorityElement(int[] nums) {
      int n=nums.length;
      int key=nums[0],t=1;
      for(int i=0;i<n;i++)
          if(key==nums[i])
            t++;
            else{
                if(t>0)
                    t--;
                else
                    key=nums[i];
            }
      return key;
    }
}
// if(nums.length == 1) {
//     return nums[0];
// }
// Arrays.sort(nums);
// return nums[nums.length / 2]; 