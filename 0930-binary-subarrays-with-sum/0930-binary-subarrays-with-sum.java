import java.util.HashMap;

class Solution {
    public int numSubarraysWithSum(int[] nums, int goal) {

        HashMap<Integer, Integer> map = new HashMap<>();
        map.put(0, 1);   

        int psum = 0;
        int count = 0;

        for(int num : nums){

            psum += num;

            if(map.containsKey(psum - goal)){
                count += map.get(psum - goal);
            }

            map.put(psum, map.getOrDefault(psum, 0) + 1);
        }

        return count;
    }
}