class Solution {
    public int maxProfit(int[] prices, int fee) {
        // 保证长度最少为1
        int min = prices[0], max = prices[0], result = 0;

        for (int i = 1, length = prices.length; i < length; i++) {
            if (min > prices[i])
                min = prices[i];
            else if (prices[i] > fee + min) {
                result += prices[i] - min - fee;
                min = prices[i] - fee;
            }
        }
        return result;
    }
}