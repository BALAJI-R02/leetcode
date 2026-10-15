// Last updated: 10/15/2026, 10:01:06 AM
1class Solution {
2    public int[] numberOfPairs(int[] nums) {
3        Arrays.sort(nums);
4        int pairs = 0;
5        for(int i = 0; i < nums.length-1; i++) {
6            if(nums[i] == nums[i+1]) {
7                pairs++;
8                i++;
9            }
10        }
11        return new int[]{pairs, nums.length-(pairs*2)};
12    }
13}