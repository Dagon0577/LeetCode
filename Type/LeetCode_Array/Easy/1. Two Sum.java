import java.util.HashMap;
import java.util.Map;

class Solution {
    public int[] twoSum(int[] nums, int target) {
        int[] result=new int[2];
        if(nums==null||nums.length<2)
        return result;
        HashMap<Integer,Integer> map=new HashMap();
        for(int i=0;i<nums.length;i++){
            int tmp=target-nums[i];
            if(map.containsKey(tmp)){
                result[0]=map.get(tmp);
                result[1]=i;
                return result;
            }
            else{
                map.put(nums[i],i);
            }
        }
        return result;
    }
}