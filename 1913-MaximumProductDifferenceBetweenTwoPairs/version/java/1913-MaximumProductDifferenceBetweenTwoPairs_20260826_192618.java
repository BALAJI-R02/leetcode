// Last updated: 8/26/2026, 7:26:18 PM
1class Solution {
2    public int maxProductDifference(int[] nums) {
3        Arrays.sort(nums);
4        int a=nums[0];
5        int b=nums[1];
6        int c=nums[nums.length-1];
7        int d=nums[nums.length-2];
8        return (c*d)-(a*b);
9    }
10}