class Solution {
    public int[] corpFlightBookings(int[][] bookings, int n) {
        int[] result = new int[n];
        for (int i = 0; i < bookings.length; ++i) {
            int l = bookings[i][0] - 1;
            int r = bookings[i][1] - 1;
            int t = bookings[i][2];
            for (; l <= r; ++l) {
                result[l] += t;
            }
        }
        return result;
    }
}