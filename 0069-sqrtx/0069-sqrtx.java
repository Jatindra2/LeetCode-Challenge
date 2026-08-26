class Solution {
    public int mySqrt(int x) {
        if (x < 2) {
            return x;
        }
        int l = 0;
        int h = x;
        while (l <= h) {
            int m = l + (h - l) / 2;
            long s = (long) m * m;
            if (s > x) {
                h = m - 1;
            } else {
                l = m + 1;
            }
        }
        return h;
    }
}