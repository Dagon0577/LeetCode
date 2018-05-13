class Solution {
    public int[][] flipAndInvertImage(int[][] A) {
        int n=A[0].length;
        for(int[] a:A)
            for(int i=0;i<(n+1)/2;i++){
                int tmp=a[i]^1;
                a[i]=a[n-i-1]^1;
                a[n-i-1]=tmp;
            }
        return A;
    }
}