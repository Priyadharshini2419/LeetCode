class Solution {
    public long maximumSubarraySum(int[] nums, int k) {
HashMap<Integer,Integer>map=new HashMap<>();
        int l=0;
        long maxsum=0;
        long sum=0;
        for(int r=0;r<nums.length;r++){
     map.put(nums[r], map.getOrDefault(nums[r], 0) + 1);
          sum+=nums[r];
          while(r-l+1>k){
            map.put(nums[l],map.get(nums[l])-1);
            if(map.get(nums[l])==0){
                map.remove(nums[l]);
            }
            sum-=nums[l];
            l++;
          }
          if(r-l+1==k&&map.size()==k){
            maxsum=Math.max(sum,maxsum);
          }
          }
          return maxsum;
        
    }
}