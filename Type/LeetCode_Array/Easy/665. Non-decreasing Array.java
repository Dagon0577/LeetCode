class Solution {
    public boolean checkPossibility(int[] nums){
       boolean res=false;
       for(int i=0;i<nums.length;i++){
           if(i+1<nums.length&&nums[i]>nums[i+1]){
               if(res)
               return false;
               else{
                   if(i-1<0||nums[i+1]>nums[i-1])
                    nums[i]=nums[i+1];
                    else
                    nums[i+1]=nums[i];
                res=true;
               }
           }
       }
       return true;
    }
}