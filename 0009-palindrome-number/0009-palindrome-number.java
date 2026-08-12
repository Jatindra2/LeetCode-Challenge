class Solution {
    public boolean isPalindrome(int x) {
        if (x<0){
            return false;
        }
        int y = x;
        int r = 0;
        while (y>0){
            r = r*10 + (y%10);
            y /= 10;
        }
        if (r == x){
            return true;
        }
        return false;
    }
}