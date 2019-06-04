class Solution{
    public List<List<Integer>> combinationSum3(int k, int n){
        if(n > 55)
            return null;
        List<List<Integer>> result = new ArrayList<>();
        List<Integer> temp = new ArrayList<>();
        helper(result,temp,k,1,n);
        return result;
    }
    
    public void helper(List<List<Integer>> result, List<Integer> temp, int k, int i, int rest){
        if(temp.size() > k || rest < 0){//提前回溯条件
            return;
        }
        if(temp.size() == k && rest == 0){//找到解
            List<Integer> col = new ArrayList<>(temp);
            result.add(col);
            return;
        }
        for(; i <= 9; ++i){//同一变量选取不同值时进入不同的下一轮迭代
            temp.add(i);//记录当前变量i的选择值并准备进入下一个变量的选择迭代
            helper(result,temp,k,i+1,rest-i);
            temp.remove(temp.size()-1);//恢复操作，保证当前变量a的值1选取不对值2选取造成影响。
        }
    }
}