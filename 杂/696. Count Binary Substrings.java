class Solution {
    public int countBinarySubstrings(String s) {    
        
        int curr=1,prev=0,count=0;
        char[] ca = s.toCharArray();
        for(int i=1;i<ca.length;i++){
            if(ca[i-1]!=ca[i]){
                count += Math.min(prev,curr);
                prev = curr;
                curr=1;
            }else{
                curr++;
            }
        }
        
        return count + Math.min(prev,curr);
    }
}
/*此题自己一开始写的是暴力解法，看了答案发现别人这个思路太屌了*/
/* 以00110为例
   这个算法复杂度是o(n)，通过比较连续的0和连续的1之间的数量差 来相加
   过程如下  i   count    prev   curr
            1   0       0       2
            2   0       2       1    
            3   0       2       2
            4   2       2       1
        return时  3       2       1
*/