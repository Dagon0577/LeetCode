//第一次暴力解法
class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        if(magazine=="")return false;
        char[] x=ransomNote.toCharArray(),y=magazine.toCharArray();
        int[] check=new int[y.length];
        int t=0;
        for(int i=0;i<x.length;i++){
            int k=0;
            for(int j=0;j<y.length;j++){
                if(x[i]==y[j]&&check[j]!=1){
                    check[j]=1;
                    t++;
                    k=1;
                    break;
                }
            }
            if(k==0)break;
        }
        if(t==x.length)
            return true;
        return false;


    }
}

//简介解法
class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        int[] letter =new int[26];
        
        for(char x:magazine.toCharArray())
            letter[x-'a']++;
        
        for(char y:ransomNote.toCharArray()){
            letter[y-'a']--;
            if(letter[y-'a']<0)
                return false;
        }
        return true;


    }
}

