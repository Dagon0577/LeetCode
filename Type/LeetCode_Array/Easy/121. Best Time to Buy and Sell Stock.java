class Solution {
    public int maxProfit(int[] prices) {
        if(prices.length==0)
        return 0;
        int result=0;
        int buy=prices[0];
        int sell=0;
        int k=0,m=0;
        for(int i=1;i<prices.length;i++){
            if(prices[i]>buy){
                sell=prices[i];
                result=Math.max(result,sell-buy);                
            }
            else if(prices[i]<buy){
                buy=prices[i];
            }

        }
        return result;
    }
}