class Solution {
    public boolean containsDuplicate(int[] nums) {
        HashSet<Integer> numbers = new HashSet<>();
        for(int num : nums){
            if(!numbers.add(num)){
                return true;
            }
        }
        return false;
    }
}