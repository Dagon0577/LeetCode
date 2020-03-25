class Solution {
    public int lengthOfLongestSubstring(String s) {
        int n = s.length(), ans = 0;
        Map<Character, Integer> map = new HashMap<>();
        for (int i = 0, j = 0; j < n; j++) {
            if (map.containsKey(s.charAt(j))) {
                i = Math.max(map.get(s.charAt(j)) + 1, i);
            }
            ans = Math.max(ans, j - i + 1);
            map.put(s.charAt(j), j);
        }
        return ans;
    }
}

/* 
class Solution {
    public int lengthOfLongestSubstring(String s) {
        int n = s.length(), ans = 0;
        int[] map = new int[256];
        for(int i = 0 , j = 0; j < n; j++){
            //对于未重复的字符，map[s.charAt(j)]为0
            i = Math.max(map[s.charAt(j)], i);
            ans = Math.max(ans, j - i + 1);
            map[s.charAt(j)] = j + 1; 
        }
        return ans;
    }
}

*/