class Solution {
    public int reverse(int x) {
        int a = x;
        long r = 0;
        while (a != 0){
            r = (r*10) + (a%10);
            a /= 10;
        }
        if (r<Integer.MIN_VALUE || r>Integer.MAX_VALUE){
            return 0;
        }
        return (int)r;
    }
}