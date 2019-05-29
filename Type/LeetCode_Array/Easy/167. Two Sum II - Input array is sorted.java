import javax.lang.model.util.ElementScanner6;

class Solution {
    public int[] twoSum(int[] numbers, int target) {
        if (target < numbers[0])
            return null;
        int i = 0, j = numbers.length - 1;
        for (; i != j;) {

            if (numbers[i] + numbers[j] == target)
                break;
            else if (numbers[i] + numbers[j] > target)
                j--;
            else
                i++;
        }
        int[] twosum = new int[2];
        twosum[0] = i + 1;
        twosum[1] = j + 1;
        return twosum;
    }
}