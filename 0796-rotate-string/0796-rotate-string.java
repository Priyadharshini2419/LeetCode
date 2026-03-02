class Solution {
    public boolean rotateString(String s, String goal) {
        if (s.length() != goal.length()) {
            return false;
        }

        String s3 = s + s;

        for (int i = 0; i <= s3.length() - goal.length(); i++) {

            int j = 0;

            while (j < goal.length() &&
                   s3.charAt(i + j) == goal.charAt(j)) {
                j++;
            }

            if (j == goal.length()) {
                return true;
            }
        }

        return false;
    }
}