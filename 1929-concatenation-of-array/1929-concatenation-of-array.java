class Solution {
    public int[] getConcatenation(int[] nums) {
        int n=nums.length;
        int []arr=new int [2*n];
        int index=0;
        for(int i=0;i<n;i++){
            arr[index]=nums[i];
            index++;
        }
        for(int i=0;i<n;i++){
arr[index]=nums[i];
index++;
        }
        return arr;
    }
}