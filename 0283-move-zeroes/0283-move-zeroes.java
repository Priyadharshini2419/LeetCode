class Solution {
    public void moveZeroes(int[] nums) {
        int[]a=new int[nums.length];
        int k=0;
    for(int i=0;i<nums.length;i++){
       if(nums[i]!=0){
      a[k]=nums[i];
      k++;
      }}
      for(int i=k;i<a.length;i++){
        a[i]=0;
      }
      for(int i=0;i<a.length;i++){
        nums[i]=a[i];
      }
    }
}