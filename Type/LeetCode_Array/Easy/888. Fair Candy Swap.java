class Solution {
    public int[] fairCandySwap(int[] A, int[] B) {
        int Sa = 0, Sb = 0;
        Set<Integer> setB = new HashSet<>();
        for (int x :A){
            Sa+=x;
        }
        for (int x: B){
            Sb+=x;
            setB.add(x);
        }
        int delta = (Sb - Sa) / 2;
        for (int x : A){
            if(setB.contains(x + delta)){
                return new int[]{x,x+delta};
            }
        }
        return null;
    }
}