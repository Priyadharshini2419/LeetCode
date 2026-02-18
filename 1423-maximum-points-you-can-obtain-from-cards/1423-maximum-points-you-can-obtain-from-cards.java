class Solution {
    public int maxScore(int[] cardPoints, int k) {
        int n=cardPoints.length;
        if(n==k){
        int sum=0;
            for(int i=0;i<n;i++){
             sum+=cardPoints[i];
            }
            return sum;
        }
        int leftsum=0;
        int rightsum=0;
        int maxsum=0;
        for(int i=0;i<k;i++){
            leftsum+=cardPoints[i];
        }
        maxsum=leftsum;
        int r=n-1;
        for(int i=k-1;i>=0;i--){
            leftsum=leftsum-cardPoints[i];
            rightsum+=cardPoints[r];
            r--;
            maxsum=Math.max(maxsum,leftsum+rightsum);
        }
        return maxsum;
    }
}