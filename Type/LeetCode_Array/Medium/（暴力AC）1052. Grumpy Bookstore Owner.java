class Solution {
    public int maxSatisfied(int[] customers, int[] grumpy, int x) {
        for(int i = 0; i < customers.length; ++i){
            if(grumpy[i] == 1){
                customers[i] = -customers[i];
            }
        }
        int sum = 0;
        int k = 0;
        for(int i =0;i<=customers.length-x;++i){
            int temp =0;
            for(int j =i; j<i+x;++j){
                if(customers[j]<0){
                    temp += customers[j];
                }
            }
            if(temp< sum){
                sum = temp;
                k=i;
            }
        }
        int result=0;
        for(int i =0;i<customers.length;++i){
            if(customers[i] > 0){
                result += customers[i];
            }else if(customers[i] <0 && (i>=k && i<k+x)){
                result += -customers[i];
            }
        }
        return result;
    }
}