class Solution {
    public int countPrimeSetBits(int L, int R) {
         int i,t,result=0;
         for (i=L;i<=R; ++i) {
                t=Integer.bitCount(i);
                if(t==2||t==3||t==5||t==7||t==11||t==13||t==17||t==19){
                result++;
            }             
        }
        return result;
    }
}