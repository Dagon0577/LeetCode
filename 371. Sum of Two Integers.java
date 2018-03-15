class Solution {
    public int getSum(int a, int b) {
        if(a==0)return b;
        int sum=a^b;
        int carry=(a&b) << 1;
        return getSum(carry,sum);
    }
}

/*
推导过程
比如a=18 b=39
    a=0 0 0 1 0 0 1 0
    b=0 0 1 0 0 1 1 1
    
  a+b=0 0 1 1 1 0 0 1
  
  a^b=0 0 1 1 0 1 0 1
  a&b=0 0 0 0 0 0 1 0
  
  carry(进位)即把 a&b 左移 再代入相加 直到进位为0
  即 =0 0 0 0 0 1 0 0


*/