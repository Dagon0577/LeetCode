class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums){
        List<Integer> result = new ArrayList<Integer>();
        
        for(int i = 0; i < nums.length; i++) {
            int val = Math.abs(nums[i]) - 1;
            if(nums[val] > 0) {
                nums[val] = -nums[val];
            }
        }
        
        for(int i = 0; i < nums.length; i++) {
            if(nums[i] > 0) {
                result.add(i+1);
            }
        }
        return result;
    }
}
/*思路
显而易见数组中都为正整数，所以取负数来标记
      [4,3,2,7,8,2,3,1]
      [-4,-3,-2,-7, 8, 2,-3,-1]
下标    1  2  3  4  5  6  7  8

*/
