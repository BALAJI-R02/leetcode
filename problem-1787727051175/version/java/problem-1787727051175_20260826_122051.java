// Last updated: 8/26/2026, 12:20:51 PM
class Solution {
    private boolean isPossible(int[] prefixSum, int n, int k, double targetAvg) {
        double possibleAvg = 0.0;

        for (int i = k; i <= n; i++) {
            possibleAvg = (prefixSum[i] - prefixSum[i - k]) / (double) k;
            if (possibleAvg >= targetAvg) return true;
        }

        return false;
    }
    public double findMaxAverage(int[] nums, int k) {
        int n = nums.length, sum = 0;
        int[] prefixSum = new int[n + 1];
        prefixSum[0] = 0;

        double low = Double.POSITIVE_INFINITY, high = Double.NEGATIVE_INFINITY;
        double diff = 1e-5;

        for (int i = 0; i < n; i++) {
            sum += nums[i];
            prefixSum[i + 1] = sum;

            low = Math.min(low, nums[i]);
            high = Math.max(high, nums[i]);
        }

        while (high - low > diff) {
            double mid = (low + high) / 2.0;

            if (isPossible(prefixSum, n, k, mid)) {
                low = mid;
            }
            else {
                high = mid;
            }
        }

        return high;
    }
}