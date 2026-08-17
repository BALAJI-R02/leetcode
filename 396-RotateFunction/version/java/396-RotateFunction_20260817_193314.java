// Last updated: 8/17/2026, 7:33:14 PM
1class Solution {
2    public int maxRotateFunction(int[] nums) {
3        long s = 0;
4        long q = 0;
5        int len = nums.length;
6        for (int i = 0; i < len; i++) {
7            s += nums[i];
8            q += (long) i * nums[i];
9        }
10        long max = q;
11        for (int i = 1; i < len; i++) {
12            q += s - (long) len * nums[len - i];
13            max = Math.max(max, q);
14        }
15        return (int) max;
16    }
17}