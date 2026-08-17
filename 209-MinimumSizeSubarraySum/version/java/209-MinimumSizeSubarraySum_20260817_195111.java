// Last updated: 8/17/2026, 7:51:11 PM
1class Solution {
2    public int minSubArrayLen(int target, int[] nums) {
3        int minLen = Integer.MAX_VALUE;
4        int left = 0;
5        int curSum = 0;
6        for (int right = 0; right < nums.length; right++) {
7            curSum += nums[right];
8            while (curSum >= target) {
9                minLen = Math.min(minLen, right - left + 1);
10                curSum -= nums[left];
11                left++;
12            }
13        }
14        return minLen == Integer.MAX_VALUE ? 0 : minLen;
15    }
16}