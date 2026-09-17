class Solution {
    public int strStr(String haystack, String needle) {
        int hlen = haystack.length();
        int nlen = needle.length();
        if(hlen<nlen){
            return -1;
        }
        int ans = -1;
        int k = 0;
        for(int i = 0; i<hlen; i++){
            if(haystack.charAt(i) == needle.charAt(k)){
                if(k==0){
                    ans = i;
                }
                k++;
                if(k == nlen){
                    return ans;
                }
            }else{
                if(k>0){
                    i = ans;
                    k = 0;
                }
                if(hlen-i-1<nlen){
                    return -1;
                }
            }
        }
        return ans;
    }
}