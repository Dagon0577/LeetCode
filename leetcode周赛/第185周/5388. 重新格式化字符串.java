class Solution {
    public String reformat(String s) {
        int n = s.length();
        if (n == 1) {
            return s;
        }
        int word = 0, number = 0;
        for (int i = 0; i < n; i++) {
            if (s.charAt(i) >= 'a' && s.charAt(i) <= 'z') {
                word++;
            } else {
                number++;
            }
        }
        if (Math.abs(word - number) > 1) {
            return "";
        }
        char[] chars = new char[n];
        int big = 0, small = 1;
        if (word >= number) {
            for (int i = 0; i < n; i++) {
                if (s.charAt(i) >= 'a' && s.charAt(i) <= 'z') {
                    chars[big] = s.charAt(i);
                    big += 2;
                } else {
                    chars[small] = s.charAt(i);
                    small += 2;
                }
            }
        } else {
            for (int i = 0; i < n; i++) {
                if (s.charAt(i) >= 'a' && s.charAt(i) <= 'z') {
                    chars[small] = s.charAt(i);
                    small += 2;
                } else {
                    chars[big] = s.charAt(i);
                    big += 2;
                }
            }
        }
        return new String(chars);
    }
}