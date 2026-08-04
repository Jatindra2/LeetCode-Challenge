class Solution {
    public List<Integer> findMissingElements(int[] nums) {
        List<Integer> ans = new ArrayList<>();
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        HashSet<Integer> present = new HashSet<>();
        for(int num : nums){
            min = Math.min(min, num);
            max = Math.max(max, num);
            present.add(num);
        }

        for(int i = min+1; i<max; i++){
            if(!present.contains(i)){
                ans.add(i);
            }
        }
        return ans;
    }
}