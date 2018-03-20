class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        Arrays.sort(nums1);
        Arrays.sort(nums2);
        int prev=0;
        ArrayList result=new ArrayList();
        for(int i=0,j=0;i<nums1.length&&j<nums2.length;){
            if(nums1[i]==nums2[j]){
                if(nums1[i]!=prev||result.size()==0){
                    result.add(nums1[i]);
                    prev=nums1[i];
                }
                i++;
                j++;
            }
            else if(nums1[i]<nums2[j]){
                i++;
            }
            else {
                j++;
            }
        }
        int[] resultSum=new int[result.size()];
        for(int i=0;i<result.size();i++){
            resultSum[i]=(int)result.get(i);
        }
        return resultSum;
    }
}