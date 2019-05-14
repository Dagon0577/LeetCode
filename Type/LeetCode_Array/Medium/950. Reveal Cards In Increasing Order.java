class Solution {
    public int[] deckRevealedIncreasing(int[] deck) {
        Arrays.sort(deck);
        int N = deck.length;
        LinkedList<Integer> list = new LinkedList<>();
        list.add(deck[N-1]);
        for(int i = N-2;i>=0;--i){
            int val=list.removeLast();
            list.addFirst(val);
            list.addFirst(deck[i]);
        }
        for(int i=0; i<N; ++i)
            deck[i] = list.get(i);
        return deck;
    }
}
