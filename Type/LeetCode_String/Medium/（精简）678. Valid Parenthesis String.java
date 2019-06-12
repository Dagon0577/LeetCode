class Solution {
    /**
     * min表示当前字符中需处理最小可能数量的左括号，max表示当前字符中需处理最大可能数量的左括号。
     * 所以当遇到'('，min++，否则min--。
     * 如果遇到了'*'，此时可以是左括号，可以是右括号，所以max++。
     * 但是如果是')'，此时只能是右括号，所以max--。
     * 当max<0时，说明此时的右括号所在坐标往前，不可能存在匹配的左括号，return false。
     * 最后需要判断最小可能数量的左括号应为0。
     **/
    public boolean checkValidString(String s) {
        int min = 0, max = 0;
        for (char c : s.toCharArray()) {
            if (c == '(') {
                min++;
                max++;
            } else {
                if (min > 0) {
                    min--;
                } 
                if (c == ')') {
                    max--;
                } else {
                    max++;
                }
            }
            if (max < 0) {
                return false;
            }
        }
        return min == 0;
    }
}