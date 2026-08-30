class Solution {
    public String addString(String s, String x, int n){
        for (int i = 0; i<n; i++){
            s += x;
        }
        return s;
    }
    public String intToRoman(int num) {
        String s = "";
        int n = 0;
        while (num>0){
            if (num>=1000){
                n = num/1000;
                s = addString(s, "M", n);
                num = num%1000;
            } else if (num>=900){
                s += "CM";
                num -= 900;
            } else if (num>=500){
                s += "D";
                num -= 500;
            } else if (num>=400){
                s += "CD";
                num -= 400;
            } else if (num>=100){
                n = num/100;
                s = addString(s, "C", n);
                num = num%100;
            } else if (num>=90){
                s += "XC";
                num -= 90;
            } else if (num>=50){
                s = addString(s, "L", 1);
                num -= 50;
            } else if (num>=40){
                s += "XL";
                num -= 40;
            } else if (num>=10){
                n = num/10;
                s = addString(s, "X", n);
                num = num%10;
            } else if (num == 9){
                s += "IX";
                num -= 9;
            } else if (num>=5){
                s += "V";
                num -= 5;
            } else if (num == 4){
                s += "IV";
                num -= 4;
            } else {
                s = addString(s, "I", num);
                num = 0;
            }
        }
        return s;
    }
}