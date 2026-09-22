class Solution {
    public boolean hasDuplicate(int[] nums) {
        HashMap<Integer, Integer> hash = new HashMap<>();
        for(int i =0; i< nums.length; i++){
            hash.put(nums[i], i);
        }
        return(hash.size() != nums.length);
    }
}