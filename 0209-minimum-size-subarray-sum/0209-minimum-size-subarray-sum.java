class Solution {
    public int minSubArrayLen(int target, int[] nums) {
           int l=0;
           int sum=0;
           int minlen=Integer.MAX_VALUE;
           for(int j=0;j<nums.length;j++){
            sum+=nums[j];
            while(sum>=target){
              minlen=Math.min(minlen,j-l+1);
              sum=sum-nums[l];
              l++;
            }
           }
           if(minlen==Integer.MAX_VALUE){
            minlen=0;
           }
           return minlen;
    }
}