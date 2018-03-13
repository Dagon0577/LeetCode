class Solution {
    public boolean hasAlternatingBits(int n) {
        int i,j;
        while(n!=0){
            i=n&1;
            n=n >> 1;
            j=n&1;
            if(j==i){
                return false;
            }
        }
        return true;
    }
}



//超简介算法
        int x = (n / 2) ^ n;
        return (x & (x + 1)) == 0;

