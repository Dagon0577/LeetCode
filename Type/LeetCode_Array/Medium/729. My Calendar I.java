//二分查找法
class MyCalendar {
    List<int[]> calendar;

    public MyCalendar() {
        calendar = new ArrayList<>();
    }

    public boolean book(int start, int end) {
        int i = 0;
        while (i < calendar.size() && calendar.get(i)[1] <= start) {
            ++i;
        }
        if (i < calendar.size() && calendar.get(i)[0] < end) {
            return false;
        }
        calendar.add(i, new int[] { start, end });
        return true;
    }
}

/**
 * Your MyCalendar object will be instantiated and called as such: MyCalendar
 * obj = new MyCalendar(); boolean param_1 = obj.book(start,end);
 */
