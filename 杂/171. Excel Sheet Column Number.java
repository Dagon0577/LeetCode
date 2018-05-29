class Solution {
    public int titleToNumber(String s) {
        int sum=0;
        int temp=0;
        char[] ch=s.toCharArray();
        for(int i=0;i<ch.length;i++)
        {
            temp=ch[i]-'A'+1;
            sum=sum*26+temp;
        }
        return sum;
    }
}