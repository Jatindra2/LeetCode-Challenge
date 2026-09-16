class Solution {
    public int maxSubArray(int[] nums) {
        int maxsum = Integer.MIN_VALUE;
        int sum = 0;
        for(int i : nums){
            sum = Math.max(sum+i, i);
            maxsum = Math.max(maxsum, sum);
        }
        return maxsum;
    }
}