class Solution {
    public String minWindow(String s, String t) {
        if (s.length() == 0 || t.length() == 0) {
            return "";
        }
        int[] count = new int[128];
        for (char c : t.toCharArray()) {
            count[c]++;
        }
        int start = 0, len = Integer.MAX_VALUE;
        int total = 0;
        for (int l = 0, r = 0; r < s.length(); r++) {
            if (count[s.charAt(r)]-- > 0) {
                total++;
            }
            while (total == t.length()) {
                if (r - l + 1 < len) {
                    len = r - l + 1;
                    start = l;
                }
                count[s.charAt(l)]++;
                if (count[s.charAt(l)] > 0) {
                    total--;
                }
                l++;
            }
        }
        return len == Integer.MAX_VALUE ? "" : s.substring(start, start + len);
    }
}
/*class Solution {
    public String minWindow(String s, String t) {
        if (s.length() == 0 || t.length() == 0) {
            return "";
        }

        Map<Character, Integer> mapT = new HashMap<>();
        for (int i = 0; i < t.length(); i++) {
            int count = mapT.getOrDefault(t.charAt(i), 0);
            mapT.put(t.charAt(i), count + 1);
        }
        int size = mapT.size();
        int formed = 0;
        int l = 0, r = 0;
        int[] ans = { -1, 0, 0 };
        Map<Character, Integer> windowsCount = new HashMap<>();
        while (r < s.length()) {
            char c = s.charAt(r);
            int count = windowsCount.getOrDefault(c, 0);
            windowsCount.put(c, count + 1);
            if (mapT.containsKey(c) && mapT.get(c).intValue() == windowsCount.get(c).intValue()) {
                formed++;
            }
            while (l <= r && formed == size) {
                if (ans[0] == -1 || r - l + 1 < ans[0]) {
                    ans[0] = r - l + 1;
                    ans[1] = l;
                    ans[2] = r;
                }
                c = s.charAt(l);
                windowsCount.put(c, windowsCount.get(c) - 1);
                if (mapT.containsKey(c) && mapT.get(c).intValue() > windowsCount.get(c).intValue()) {
                    formed--;
                }
                l++;
            }
            r++;
        }
        return ans[0] == -1 ? "" : s.substring(ans[1], ans[2] + 1);
    }
}*/