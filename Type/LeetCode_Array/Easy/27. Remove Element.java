    class Solution {
        public int removeElement(int[] nums, int val) {
        //     int t=0;
        //     int len=nums.length-1;
        //    for(int i=0;i<len;i++){
        //        if(nums[i]==val){
        //            while(i!=len&&nums[len]==val){
        //                t++;
        //                len--;
        //            }
        //             nums[i]^=nums[len];
        //             nums[len]^=nums[i];
        //             nums[i]^=nums[len];
        //             t++;
        //             len--;
        //        }
        //    }
        //     return nums.length-t;
        int index=0;
        int v_Index=0;
        while(v_Index<nums.length){
            while(v_Index<nums.length&&nums[v_Index]==val){
                v_Index++;
            }
            if(v_Index<nums.length){
                nums[index]=nums[v_Index];
                index++;
                v_Index++;
            }

        }
        return index;
        }
    }