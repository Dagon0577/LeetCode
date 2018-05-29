class Solution {
    public List<String> letterCasePermutation(String S) {
            List<String> result=new ArrayList<>();
            DFS(S.toCharArray(),0,result);    
        return result;
    }
    public void DFS(char[] S,int i,List<String> result){
        if(i==S.length){
            result.add(new String(S));
            return;
        }
        DFS(S,i+1,result);
        if(!Character.isLetter(S[i])) return;
        /*查ASCII码表 大小写字母的ASCII码差值为32, 32是2的5次方*/
        S[i]^=1 << 5;
        DFS(S,i+1,result);
        S[i]^=1 << 5;
    }
}