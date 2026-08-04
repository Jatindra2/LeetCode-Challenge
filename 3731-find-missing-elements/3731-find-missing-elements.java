class Solution {
    public List<Integer> findMissingElements(int[] nums) {
        ArrayList<Integer> ans = new ArrayList<>();
        Arrays.sort(nums);
        int min = nums[0];
        for (int num : nums){
            if(num-min > 1){
                for (int i = min+1; i<num; i++){
                    ans.add(i);
                }
            }
            min = num;
        }
        return ans;
    }
}