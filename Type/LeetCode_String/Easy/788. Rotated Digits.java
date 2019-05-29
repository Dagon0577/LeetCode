class Solution {
    public int rotatedDigits(int N) {
        int t = 0;
        int temp = 0;
        boolean is_True = false;
        for (int i = 1; i < N + 1; i++) {
            temp = i;
            is_True = false;
            while (temp > 0) {
                int Digits = temp % 10;
                if (Digits == 3 || Digits == 4 || Digits == 7) {
                    is_True = false;
                    break;
                } else if (Digits == 2 || Digits == 5 || Digits == 6 || Digits == 9) {
                    is_True = true;
                }
                temp = temp / 10;
            }
            if (is_True) {
                t += 1;
            }
        }
        return t;
    }
}