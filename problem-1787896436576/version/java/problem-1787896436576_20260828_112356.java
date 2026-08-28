// Last updated: 8/28/2026, 11:23:56 AM
1class Solution {
2    public int[] runningSum(int[] nums) {
3        //int[]arr=new int[nums.length];
4        for(int i=1;i<nums.length;i++){
5            nums[i]=nums[i-1]+nums[i];
6        }
7        return nums;
8    }
9}