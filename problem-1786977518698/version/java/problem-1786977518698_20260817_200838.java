// Last updated: 8/17/2026, 8:08:38 PM
1class Solution {
2    public int maxProduct(int[] nums) {
3        Arrays.sort(nums);
4        int a=nums.length;
5        return (nums[a-1]-1)*(nums[a-2]-1);
6    }
7}