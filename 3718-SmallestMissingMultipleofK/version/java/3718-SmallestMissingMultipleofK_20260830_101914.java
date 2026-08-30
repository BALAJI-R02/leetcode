// Last updated: 8/30/2026, 10:19:14 AM
1class Solution {
2    public int missingMultiple(int[] nums, int k) {
3        HashSet<Integer> set = new HashSet<>();
4        for (int num : nums) 
5            set.add(num);
6        int cur = k;
7        while (set.contains(cur)) {
8            cur += k;
9        }
10        return cur;
11    }
12}