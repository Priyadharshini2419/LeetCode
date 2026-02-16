class Solution {
    public int heightChecker(int[] heights) {
        int []list=new int[heights.length];
        for(int i=0;i<heights.length;i++){
            list[i]=heights[i];
        }
        Arrays.sort(list);
        int count=0;
        for(int i=0;i<heights.length;i++){
            if(list[i]!=heights[i]){
                count++;
            }
        }
        return count;
    }
}