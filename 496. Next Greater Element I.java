class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
       if (nums1 == null || nums1.length == 0) {
            return nums1;
        }
        for(int i=0;i<nums1.length;i++){
            int k;
            for(k=0;k<nums2.length;k++)
                    if(nums2[k]==nums1[i]){break;}
            int j=k;
            for(;j<nums2.length;j++){
                if(nums2[j]>nums1[i]){
                    nums1[i]=nums2[j];
                    break;
                }
            }
            if(j==nums2.length){
                nums1[i]=-1;
            }
            
            
            
        }
        return nums1;
    }
}