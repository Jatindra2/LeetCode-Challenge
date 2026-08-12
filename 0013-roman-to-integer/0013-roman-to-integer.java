class Solution {
    public int romanToInt(String s) {
        int n = s.length();
        int ans = 0;
        for (int i = 0; i<n; i++){
            char c = s.charAt(i);
            if (c == 'I'){
                if (i+1<n && (s.charAt(i+1) == 'V' || s.charAt(i+1) == 'X')){
                    ans -= 1;
                } else {
                    ans += 1;
                }
            } else if (c == 'V'){
                ans += 5;
            } else if (c == 'X'){
                if (i+1<n && (s.charAt(i+1) == 'L' || s.charAt(i+1) == 'C')){
                    ans -= 10;
                } else{
                    ans += 10;
                }
            } else if (c == 'L'){
                ans += 50;
            } else if (c == 'C'){
                if (i+1<n && (s.charAt(i+1) == 'D' || s.charAt(i+1) == 'M')){
                    ans -= 100;
                } else{
                    ans += 100;
                }
            } else if (c == 'D'){
                ans += 500;
            } else if (c == 'M'){
                ans += 1000;
            }
        }
        return ans;
    }
}