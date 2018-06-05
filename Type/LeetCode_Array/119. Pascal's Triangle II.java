import java.util.ArrayList;
class Solution {
    public List<Integer> getRow(int rowIndex) {
        List<Integer> result=new ArrayList<Integer>();
        result.add(1);
        for(int i=1;i<=rowIndex;i++)
        {
            result.add((int)((long) result.get(i-1)*(rowIndex - (i-1))/i  ));//排列组合C
        }
                       return result;
    }
}
        // List<List<Integer>> result=new ArrayList<>();
        // result.add(new ArrayList<>());
        // result.get(0).add(1);
        // for(int i=1;i<=rowIndex;i++){
        //     List<Integer> row=new ArrayList<>();
        //     List<Integer> prev=result.get(i-1);
        //     row.add(1);
        //     for(int j=1;j<i;j++)
        //      row.add(prev.get(j)+prev.get(j-1));
        //     row.add(1);
        //     result.add(row);
        // }
        // return result.get(rowIndex);