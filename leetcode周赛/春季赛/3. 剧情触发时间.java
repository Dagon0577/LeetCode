class Solution {
    public int[] getTriggerTime(int[][] increase, int[][] requirements) {
        int[] res = new int[requirements.length];
        for(int i = 1;i < increase.length; i++){
            increase[i][0] +=increase[i-1][0];
            increase[i][1] +=increase[i-1][1];
            increase[i][2] +=increase[i-1][2];
        }
        for(int i = 0; i < requirements.length; i++){
            for(int j = 0; j < increase.length;j++){
                if(requirements[i][0] == 0 && requirements[i][1] == 0 &&requirements[i][2] == 0){
                    res[i] = 0;
                    break;
                }
                if(increase[j][0] >= requirements[i][0] && increase[j][1] >= requirements[i][1] && increase[j][2] >= requirements[i][2] ){
                    res[i] = j + 1;
                    break;
                }
                if(j == increase.length - 1){
                    res[i] = -1;
                }
            }
        }
        return res;
    }
}