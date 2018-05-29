class Solution {
    public boolean isOneBitCharacter(int[] bits) {
        if(bits.length==1)return bits[0]==0;
        int prev=bits[0];
        int curr=1;/*上一个可表示的子串长度*/
        for(int i=1;i<bits.length;i++){
            if(prev==0&&curr==2){
                curr=1;
                prev=bits[i];
            }
            else if(prev==1&&curr==2){
                curr=1;
                prev=bits[i];
            }else if(prev==0&&curr==1){
                prev=bits[i];                
            }else{
                curr++;
                prev=bits[i];
            }
        }
        if(curr==1)return true;
        else return false;
    }
}

//改进
class Solution {
    public boolean isOneBitCharacter(int[] bits) {
        //if(bits.length==1)return bits[0]==0;
        boolean is_True = false;
        int curr=0;
        while(curr<bits.length) {
            if(bits[curr]== 1) {
                curr+=2;
                is_True=false;
            } else{
                is_True=true;
                curr++;
            }
        }

        return is_True;
    }
}
