class Solution {

    public int maxProduct(String[] words) {

        int n = words.length;
        boolean[][] freq = new boolean[n][26];
        for (int i = 0; i < n; i++) {
            for (char c : words[i].toCharArray()) {
                freq[i][c - 'a'] = true;
            }
        }

        int maxi = 0;

        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {

                if (!hasCommon(freq[i], freq[j])) {
                    maxi = Math.max(maxi,
                           words[i].length() * words[j].length());
                }
            }
        }
        return maxi;
    }

    private boolean hasCommon(boolean[] a, boolean[] b) {
        for (int k = 0; k < 26; k++) {
            if (a[k] && b[k]) return true;
        }
        return false;
    }
}
