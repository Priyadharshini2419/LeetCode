
class Solution {
    public int minimizeTheDifference(int[][] mat, int target) {
        boolean[] dp = new boolean[5000];
        dp[0] = true;

        for (int[] row : mat) {
            boolean[] next = new boolean[5000];

            for (int s = 0; s < 5000; s++) {
                if (!dp[s]) continue;

                for (int val : row) {
                    int newSum = s + val;
                    if (newSum < 5000) {
                        next[newSum] = true;
                    }
                }
            }
            dp = next;
        }

        int ans = Integer.MAX_VALUE;

        for (int s = 0; s < 5000; s++) {
            if (dp[s]) {
                ans = Math.min(ans, Math.abs(s - target));
            }
        }

        return ans;
    }
}