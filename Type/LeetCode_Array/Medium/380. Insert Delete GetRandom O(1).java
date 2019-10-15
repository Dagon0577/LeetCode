class RandomizedSet {
    List<Integer> indexList;
    HashMap<Integer, Integer> map;

    /** Initialize your data structure here. */
    public RandomizedSet() {
        map = new HashMap<>();
        indexList = new ArrayList<>();
    }

    /**
     * Inserts a value to the set. Returns true if the set did not already contain
     * the specified element.
     */
    public boolean insert(int val) {
        if (map.containsKey(val))
            return false;
        indexList.add(val);
        int index = indexList.size() - 1;
        map.put(val, index);
        return true;
    }

    /**
     * Removes a value from the set. Returns true if the set contained the specified
     * element.
     */
    public boolean remove(int val) {
        if (!map.containsKey(val))
            return false;
        int index = map.get(val);
        map.remove(val);
        if (index < indexList.size() - 1) {
            int size = indexList.size();
            int temp = indexList.get(size - 1);
            map.put(temp, index);
            indexList.set(index, temp);
        }
        indexList.remove(indexList.size() - 1);
        return true;
    }

    /** Get a random element from the set. */
    public int getRandom() {
        int index = (int) (Math.random() * indexList.size());
        return indexList.get(index);
    }
}

/**
 * Your RandomizedSet object will be instantiated and called as such:
 * RandomizedSet obj = new RandomizedSet(); boolean param_1 = obj.insert(val);
 * boolean param_2 = obj.remove(val); int param_3 = obj.getRandom();
 */