class Solution {
    public int[] shortestToChar(String s, char c) {

        int n = s.length();
        int[] ans = new int[n];

        for(int i = 0; i < n; i++) {

            ans[i] = Integer.MAX_VALUE;  

            for(int j = 0; j < n; j++) {
                if(s.charAt(j) == c) {
                    ans[i] = Math.min(ans[i], Math.abs(j - i));
                }
            }
        }

        return ans;
    }
}
