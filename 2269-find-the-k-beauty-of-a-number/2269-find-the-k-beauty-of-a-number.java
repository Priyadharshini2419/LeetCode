class Solution {
    public int divisorSubstrings(int num, int k) {
        int count = 0;
        String s = String.valueOf(num);

        for (int i = 0; i <= s.length() - k; i++) {

        
            String b = s.substring(i, i + k);

            int x = Integer.parseInt(b);

            if (x != 0 && num % x == 0) {
                count++;
            }
        }
        return count;
    }
}