// Last updated: 9/1/2026, 11:35:54 AM
1class Solution {
2    public int longestSubarray(int[] nums) {
3        int n = nums.length;
4        int left = 0;
5        int zeros = 0;
6        int ans = 0;
7        for (int right = 0; right < n; right++) {
8            if (nums[right] == 0) {
9                zeros++;
10            }
11            while (zeros > 1) {
12                if (nums[left] == 0) {
13                    zeros--;
14                }
15                left++;
16            }
17            ans = Math.max(ans, right - left + 1 - zeros);
18        }
19        return (ans == n) ? ans - 1 : ans;
20    }
21}