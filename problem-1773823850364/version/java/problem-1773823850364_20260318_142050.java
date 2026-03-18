// Last updated: 3/18/2026, 2:20:50 PM
1class Solution {
2    public int maxSubArray(int[] nums) {
3      int curr=nums[0];
4      int m=nums[0];
5      for(int i=1;i<nums.length;i++){
6        curr=Math.max(nums[i],curr+nums[i]);
7        m=Math.max(curr,m);
8      }  
9      return m;
10    }
11}