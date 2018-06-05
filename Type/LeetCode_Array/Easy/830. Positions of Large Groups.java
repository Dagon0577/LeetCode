import java.util.ArrayList;
import java.util.Arrays;

class Solution {
    public List<List<Integer>> largeGroupPositions(String S) {
        List<List<Integer>> result=new ArrayList();
        if(S.length()<3)
        return result;

        char c=S.charAt(0);
        int len=S.length();
        int num=1;
        for(int i=1;i<len;i++)
        {
            if(S.charAt(i)==c)
                num++;
            else {
                if(num>=3){
                    result.add(Arrays.asList(new Integer[]{i-num,i-1}));
                }
                num=1;
                c=S.charAt(i);
            }

        }
        if(num>=3){
            result.add(Arrays.asList(new Integer[]{len-num,len-1}));
        }
        return result;
    }
}

// List<List<Integer>> ans = new ArrayList();
// int i = 0, N = S.length(); // i is the start of each group
// for (int j = 0; j < N; ++j) {
//     if (j == N-1 || S.charAt(j) != S.charAt(j+1)) {
//         // Here, [i, j] represents a group.
//         if (j-i+1 >= 3)
//             ans.add(Arrays.asList(new Integer[]{i, j}));
//         i = j + 1;
//     }
// }

// return ans;