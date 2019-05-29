class Solution {
    public boolean canPlaceFlowers(int[] flowerbed, int n) {
        if (n == 0)
            return true;
        int index = 0;
        while (n > 0 && index < flowerbed.length) {
            if ((flowerbed[index] == 0 && index < flowerbed.length - 1 && flowerbed[index + 1] == 0)
                    || (index == flowerbed.length - 1 && flowerbed[index] == 0)) {
                n--;
                if (n == 0)
                    return true;
                index += 2;
            } else if (flowerbed[index] == 1) {
                index += 2;
            } else {
                index += 3;
            }
        }
        return false;
    }

}
// if(n==0)
// return true;
// if(flowerbed.length==1)
// return n==(1-flowerbed[0]);
// int t=0;
// if(flowerbed[0]==0&&flowerbed[1]==0)
// {
// flowerbed[0]=1;
// t++;
// }
// for(int i=1;i<flowerbed.length-1&&t<n;i++){
// if(flowerbed[i]==0&&flowerbed[i-1]==0&&flowerbed[i+1]==0)
// {
// t++;
// flowerbed[i]=1;
// }
// }
// if(flowerbed[flowerbed.length-1]==0&&flowerbed[flowerbed.length-2]==0)
// {
// flowerbed[flowerbed.length-1]=1;
// t++;
// }
// return t>=n;