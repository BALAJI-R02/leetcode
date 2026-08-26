// Last updated: 8/26/2026, 12:19:45 PM
1class Solution {
2    public double findMaxAverage(int[] nums, int k) {
3        int maxsum = Integer.MIN_VALUE;
4        double avg = 0;
5        for (int i = 0; i <= nums.length - k; i++) {
6            int sum = 0;
7            for (int j = i; j < i + k; j++) 
8                sum += nums[j];
9            if (sum > maxsum) {
10                maxsum = sum;
11                avg = (double) maxsum / k;
12            }
13        }
14        return avg;
15    }
16}