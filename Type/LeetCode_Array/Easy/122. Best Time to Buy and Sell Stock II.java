class Solution {
    public int maxProfit(int[] prices) {
        if (prices == null || prices.length <= 1)
            return 0;
        int sum = 0;
        int min = prices[0];
        for (int i = 1; i < prices.length; i++) {
            if (min > prices[i])
                min = prices[i];
            else {
                sum += prices[i] - min;
                min = prices[i];
            }
        }
        return sum;
    }
}