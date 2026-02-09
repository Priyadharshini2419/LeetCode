class Solution {
    public int removeDuplicates(int[] nums) {
        TreeSet<Integer>set=new TreeSet<>();
        for(int i=0;i<nums.length;i++){
            set.add(nums[i]);
        }
        int index = 0;
        for(int val : set){
            nums[index] = val;
            index++;
        }

        return set.size();
    }
}