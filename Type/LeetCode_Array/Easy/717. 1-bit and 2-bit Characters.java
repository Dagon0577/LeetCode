import java.util.*;
class Solution {
    public boolean isOneBitCharacter(int[] bits) {
        boolean result=false;
        for(int i=0;i<bits.length;){
            if(bits[i]==1)
            {
                i+=2;
                result=false;
            }
            else{
                i++;
                result=true;
            }
        }
        return result;
    }
}