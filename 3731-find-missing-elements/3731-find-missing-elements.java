class Solution {
    public List<Integer> findMissingElements(int[] nums) {
        List<Integer> ans = new ArrayList<>();
        int min = nums[0];
        int max = nums[0];
        for(int num : nums){
            min = Math.min(min, num);
            max = Math.max(max, num);
        }

        int[] arr = new int[max+1];
        for(int num : nums){
            arr[num] = 1;
        }

        for(int i = min+1; i<max; i++){
            if(arr[i] == 0){
                ans.add(i);
            }
        }
        return ans;
    }
}