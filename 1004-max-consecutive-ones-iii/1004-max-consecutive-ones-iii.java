class Solution {
    public int longestOnes(int[] nums, int k) {
        int r=0;
        int l=0;
        int zero=0;
        int maxi=0;
        while(r<nums.length){
            if(nums[r]==0)
            zero++;
            
            if(zero<=k){
                int len=r-l+1;
                maxi=Math.max(len,maxi);
            }
            while(zero>k){
                if(nums[l]==0){
                    zero--;
                }
                    l++;
                
            }
            r++;
        }
        return maxi;
    }
}