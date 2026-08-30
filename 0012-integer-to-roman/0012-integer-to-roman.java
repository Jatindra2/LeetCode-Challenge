class Solution {
    public String addString(String s, String x, int n){
        for (int i = 0; i<n; i++){
            s += x;
        }
        return s;
    }
    public String intToRoman(int num) {
        int i = 0;
        char[] ans = new char[16];
        if (num>=1000){
            while(num>=1000){
                ans[i++] = 'M';
                num -= 1000;
            }
        }
        if (num>=900){
            ans[i++] = 'C';
            ans[i++] = 'M';
            num -= 900;
        }
        if (num>=500){
            ans[i++] = 'D';
            num -= 500;
        }
        if (num>=400){
            ans[i++] = 'C';
            ans[i++] = 'D';
            num -= 400;
        }if (num>=100){
            while(num>=100){
                ans[i++] = 'C';
                num -= 100;
            }
        }
        if (num>=90){
            ans[i++] = 'X';
            ans[i++] = 'C';
            num -= 90;
        }
        if (num>=50){
            ans[i++] = 'L';
            num -= 50;
        }
        if (num>=40){
            ans[i++] = 'X';
            ans[i++] = 'L';
            num -= 40;
        }
        if (num>=10){
            while(num>=10){
                ans[i++] = 'X';
                num -= 10;
            }
        }
        if (num == 9){
            ans[i++] = 'I';
            ans[i++] = 'X';
            num -= 9;
        }
        if (num>=5){
            ans[i++] = 'V';
            num -= 5;
        }
        if (num == 4){
            ans[i++] = 'I';
            ans[i++] = 'V';
            num -= 4;
        } else {
            while(num>0){
                ans[i++] = 'I';
                num -= 1;
            }
        }
        return new String(ans, 0, i);
    }
}