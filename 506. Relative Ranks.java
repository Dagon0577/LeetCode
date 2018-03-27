//暴力AC
class Solution {
    public String[] findRelativeRanks(int[] nums) {
        int[] Copy=new int[nums.length];
        for(int i=0;i<nums.length;i++)
            Copy[i]=nums[i];
        Arrays.sort(Copy);
        String[] result=new String[nums.length];
        for(int i=0;i<nums.length;i++){
            for(int j=0;j<nums.length;j++){
                if(Copy[i]==nums[j]){
                    if(i+1==nums.length)
                        result[j]="Gold Medal";
                    else if(i+1==nums.length-1)
                        result[j]="Silver Medal";
                    else if(i+1==nums.length-2)
                        result[j]="Bronze Medal";
                    else
                    result[j]=String.valueOf(nums.length-i);                    
                }

            }
        }
        return result;
    }
}

// 别人的解法
class Solution {
    public String[] findRelativeRanks(int[] nums) {
        String[] result=new String[nums.length];
        int max=0;
        for(int i:nums)
            if(i>max)
                max=i;
        int[] hash=new int[max+1];
        for(int i=0;i<nums.length;i++)
            hash[nums[i]]=i+1;
        int place=1;
        for(int i=hash.length-1;i>=0;i--){
            if(hash[i]!=0){
                if(place==1){
                     result[hash[i]-1]="Gold Medal";
                }
                else if(place==2)
                    result[hash[i]-1]="Silver Medal";
                else if(place==3)
                    result[hash[i]-1]="Bronze Medal";
                else
                    result[hash[i]-1]=String.valueOf(place);
                place++;
            }
        }
        return result;
    }
}
