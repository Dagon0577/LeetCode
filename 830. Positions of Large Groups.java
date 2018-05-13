import java.*;
import java.util.ArrayList;

class Solution {
    public List<List<Integer>> largeGroupPositions(String S) {
        
        if(S.length()<3){
            return new ArrayList<>();
        }
        
        List<List<Integer>> result=new ArrayList();
        int i=0,N=S.length();
        int len=3;
        for(int j=0;j<N;j++){
            if(j==N-1||S.charAt(j)!=S.charAt(j+1)){
                if(j-i+1>=3){
                    result.add(Arrays.asList(new Integer[]{i,j}));
                    //len=Math.max(len,j+i-1);
                }

                i=j+1;
            }
        }
        
        return result;
    }
}