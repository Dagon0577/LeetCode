/*超简介算法*/
class Solution {
    public boolean rotateString(String A, String B) {
        if(A.length()!=B.length())return false;
        String N = A + A;
        return N.contains(B);
    }
}