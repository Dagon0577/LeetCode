class Solution {
    public List<Integer> pancakeSort(int[] A) {
      List<Integer> res = new ArrayList<>();
      for (int i = A.length,j; i > 0; --i){
          for (j = 0; A[j] != i;j++);
          reverse(A, j);
          res.add(j + 1);
          reverse(A, i-1);
          res.add(i);
      }
      return res;
  }
  public void reverse(int[] A, int k) {
      int i = 0,j=k;
      while(i<j){
          A[i] ^=A[j];
          A[j] ^=A[i];
          A[i] ^=A[j];
          i++;
          j--;
      }
  }
}
