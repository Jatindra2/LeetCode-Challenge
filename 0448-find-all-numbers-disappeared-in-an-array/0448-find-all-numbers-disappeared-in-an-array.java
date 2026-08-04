class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        List<Integer> ans = new ArrayList<>();
        HashSet<Integer> present = new HashSet<>();
        int n = nums.length;
        for(int num : nums){
            present.add(num);
        }

        for(int i = 1; i<=n; i++){
            if(present.add(i)){
                ans.add(i);
            }
        }
        return ans;
    }
}