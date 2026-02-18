class Solution {
    public int lengthOfLongestSubstring(String s) {

        int n = s.length();
        int l = 0;
        int r = 0;
        int maxlen = 0;

        int[] hash = new int[256];  

        for (int i = 0; i < 256; i++) {
            hash[i] = -1;
        }

        while (r < n) {

            char c = s.charAt(r);

            if (hash[c] != -1 && hash[c] >= l) {
                l = hash[c] + 1;
            }

            int len = r - l + 1;
            maxlen = Math.max(len, maxlen);

            hash[c] = r;
            r++;
        }

        return maxlen;
    }
}
