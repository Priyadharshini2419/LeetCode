class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        Arrays.sort(nums);
        List<Integer> list = new ArrayList<>();
        int mis = 1;

        for(int i = 0; i < nums.length; i++){
            if(nums[i] == mis){
                mis++;
            }
            
            else if(nums[i] > mis){
                list.add(mis);
                mis++;     
                i--;      
            }
        }

        while(mis <= nums.length){
            list.add(mis);
            mis++;
        }

        return list;
    }
}
