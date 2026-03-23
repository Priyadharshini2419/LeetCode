class Solution {

    public static int helper(int[] weights, int mid) {

        int csum = 0;
        int days = 1;

        for (int x : weights) {

            if (csum + x > mid) {
                days++;
                csum = x;
            }
            else {
                csum = csum + x;
            }
        }

        return days;
    }

    public int shipWithinDays(int[] weights, int days) {

        int maxi = Integer.MIN_VALUE;

        for (int i = 0; i < weights.length; i++) {
            if (weights[i] > maxi) {
                maxi = weights[i];
            }
        }

        // Find total sum
        int sum = 0;
        for (int i = 0; i < weights.length; i++) {
            sum += weights[i];
        }

        int low = maxi;
        int high = sum;

        while (low < high) {

            int mid = (low + high) / 2;

            if (helper(weights, mid) <= days) {
                high = mid;
            }
            else {
                low = mid + 1;
            }
        }

        return low;
    }
}