class Solution {
    public boolean rotateString(String A, String B) {
        int len = (int)A.length();
        for(int i=0;i<len;++i){
            if(B.equals(A.substring(i,len)+A.substring(0,i)))
                return true;
        }
        return false;
    }
}

/*超简介算法*/
class Solution {
    public boolean rotateString(String A, String B) {
        String N = A + A;
        return N.contains(B);
    }
}