class SnapshotArray {

    private int id;
    private List<Integer>[] array;

    public SnapshotArray(int length) {
        array = new List[length];
        for (int i = 0; i < array.length; ++i) {
            array[i] = new ArrayList<>();
        }
        id = 0;
    }

    public void set(int index, int val) {
        List<Integer> list = array[index];
        int valueRepeat = (list.isEmpty()) ? 0 : list.get(list.size() - 1);
        for (int i = list.size() - 1; i < id; i++) {
            list.add(valueRepeat);
        }
        list.set(id, val);
    }

    public int snap() {
        return id++;
    }

    public int get(int index, int snap_id) {
        List<Integer> list = array[index];
        if (list.isEmpty())
            return 0;
        if (list.size() - 1 < snap_id)
            return list.get(list.size() - 1);
        return list.get(snap_id);
    }
}

/**
 * Your SnapshotArray object will be instantiated and called as such:
 * SnapshotArray obj = new SnapshotArray(length); obj.set(index,val); int
 * param_2 = obj.snap(); int param_3 = obj.get(index,snap_id);
 */