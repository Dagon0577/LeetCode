class Solution {
    public int findPoisonedDuration(int[] timeSeries, int duration) {
        if(timeSeries.length==0)
            return 0;
        int result=duration;
        int time=timeSeries[0];
        for(int i = 1; i < timeSeries.length; ++i){
            if(timeSeries[i] < time + duration - 1){
                time = timeSeries[i];
                result += timeSeries[i]-timeSeries[i-1];
            }else if(timeSeries[i] == time + duration -1){
                time = timeSeries[i];
                result += duration-1;
            }else{
                time = timeSeries[i];
                result += duration;
            }
        }
        return result;
    }
}