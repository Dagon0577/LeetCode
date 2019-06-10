class Solution {
    public int maxSatisfied(int[] customers, int[] grumpy, int X) {
        int baseHappy = 0;
        // 1. 计算原本就开心的客户数量
        for (int i = 0; i < customers.length; ++i) {
            if (grumpy[i] == 0) {
                baseHappy += customers[i];
            }
        }
        // 2. 生成 不开心客户的数组
        int[] unHappys = new int[customers.length];
        for (int i = 0; i < customers.length; ++i) {
            if (grumpy[i] == 1) {
                unHappys[i] = customers[i];
            }
        }
        int extraHappy = 0;
        // 3.1 先计算 前 X 分钟的收益
        for (int i = 0; i < X; ++i) {
            extraHappy += unHappys[i];
        }
        int maxExtraHappy = extraHappy;
        // 3.2 求出 前 X 分钟的最大收益
        for (int i = X; i < unHappys.length; ++i) {
            extraHappy += unHappys[i];
            extraHappy -= unHappys[i - X];
            if (extraHappy > maxExtraHappy) {
                maxExtraHappy = extraHappy;
            }
        }
        return baseHappy + maxExtraHappy;
    }
}