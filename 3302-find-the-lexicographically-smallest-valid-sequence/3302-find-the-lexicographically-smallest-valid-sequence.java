class Solution {
    public int[] validSequence(String word1, String word2) {
        char[] w1 = word1.toCharArray();
        char[] w2 = word2.toCharArray();
        int n = w1.length;
        int m = w2.length;
        
        int[] last = new int[m];
        Arrays.fill(last, -1);
        
        int i = n - 1;
        int j = m - 1;
        while (i >= 0 && j >= 0) {
            if (w1[i] == w2[j]) {
                last[j] = i;
                j--;
            }
            i--;
        }
        
        int[] ans = new int[m];
        boolean canSkip = true;
        j = 0;
        
        for (i = 0; i < n && j < m; i++) {
            if (w1[i] == w2[j]) {
                ans[j] = i;
                j++;
            } else if (canSkip && (j == m - 1 || last[j + 1] > i)) {
                ans[j] = i;
                j++;
                canSkip = false;
            }
        }
        
        return j == m ? ans : new int[0];
    }
}