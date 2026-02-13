class Solution {
    public int[] findErrorNums(int[] nums) {
        int[] a = new int[2];
        int mis = 1;
        
        Arrays.sort(nums);

        TreeSet<Integer> t = new TreeSet<>();
        for(int x : nums){
            t.add(x);
        }

        for(int y : t){
            if(y != mis){
                a[1] = mis;
                break;            
            }
            mis++;
        }

    
        if(a[1] == 0){
            a[1] = nums.length;
        }

    
        for(int i = 0; i < nums.length-1; i++){
            if(nums[i] == nums[i+1]){
                a[0] = nums[i];
            }
        }

        return a;
    }
}
