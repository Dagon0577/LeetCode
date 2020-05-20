/*
 * @lc app=leetcode.cn id=208 lang=java
 *
 * [208] 实现 Trie (前缀树)
 */

// @lc code=start
class Trie {
    private boolean isEnd = false;
    private Trie[] next = new Trie[26];
      /** Initialize your data structure here. */
    public Trie() {
    }
    
    /** Inserts a word into the trie. */
    public void insert(String word) {
        Trie root = this;
        char[] w = word.toCharArray();
        for(int i = 0; i < w.length; i++) {
            if(root.next[w[i] - 'a'] == null) {
                root.next[w[i] - 'a'] = new Trie();
            }
            root = root.next[w[i] - 'a'];
        }
        root.isEnd = true;
    }
    
    /** Returns if the word is in the trie. */
    public boolean search(String word) {
        Trie root = this;
        char[] w = word.toCharArray();
        for(int i = 0; i < w.length; i++) {
            if(root.next[w[i] - 'a'] == null) {
                return false;
            }
            root = root.next[w[i] - 'a'];
        }
        return root.isEnd;
    }
    
    /** Returns if there is any word in the trie that starts with the given prefix. */
    public boolean startsWith(String prefix) {
        Trie root = this;
        char[] w = prefix.toCharArray();
        for(int i = 0; i < w.length; i++) {
            if(root.next[w[i] - 'a'] == null) {
                return false;
            }
            root = root.next[w[i] - 'a'];
        }
        return true;
    }
}

/**
 * Your Trie object will be instantiated and called as such:
 * Trie obj = new Trie();
 * obj.insert(word);
 * boolean param_2 = obj.search(word);
 * boolean param_3 = obj.startsWith(prefix);
 */
// @lc code=end

