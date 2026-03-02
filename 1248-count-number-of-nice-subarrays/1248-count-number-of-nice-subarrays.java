import java.util.HashMap;

class Solution {
    public int numberOfSubarrays(int[] nums, int k) {

        HashMap<Integer, Integer> map = new HashMap<>();
        map.put(0, 1);

        int psum = 0;
        int count = 0;

        for(int num : nums){

            if(num % 2 == 1)
                psum += 1;
            else
                psum += 0;

            if(map.containsKey(psum - k)){
                count += map.get(psum - k);
            }

            map.put(psum, map.getOrDefault(psum, 0) + 1);
        }

        return count;
    }
}