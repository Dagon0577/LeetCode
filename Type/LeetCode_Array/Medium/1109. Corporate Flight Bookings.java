class Solution {
    public int[] corpFlightBookings(int[][] bookings, int n) {
        int[] result = new int[n];
        for (int[] row : bookings) {
            result[row[0] - 1] += row[2];
            if (row[1] < n) {
                // 减去多累加的一次
                result[row[1]] -= row[2];
            }
        }
        for (int i = 1; i < result.length; ++i) {
            result[i] += result[i - 1];
        }
        return result;
    }
}



//思路
/*
Example 1:

Input: bookings = [[1,2,10],[2,3,20],[2,5,25]], n = 5
Output: [10,55,45,25,25]

0       1       2       3       4
+10     +10
        +20     +20
        +25     +25     +25     +25

由图可得，对于[1,2,10]来说，a[0]~a[1]间的值，均加上了10，则可视为，a[0]=10，a[1]=a[0]
         对于[2,3,20]来说，a[1]~a[2]间的值，均加上了20，则可视为，a[1]=10+20，a[2]=a[1]-10
         对于[2,5,25]来说，a[1]~a[4]间的值，均加上了25，则可视为，a[1]=10+20+25，a[2]=a[1]-10,a[3]=a[2]-20,a[4]=a[3]
等同于

0       1       2       3       4
+10             -10
        +20            -20
        +25

10      45      -10     -20     0

a[i]+=a[i-1];        

*/