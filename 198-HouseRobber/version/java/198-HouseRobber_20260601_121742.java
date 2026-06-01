// Last updated: 6/1/2026, 12:17:42 PM
1class Solution {
2    public int rob(int[] nums) {
3        if(nums.length==1)
4        return nums[0];
5       int dp[]=new int[nums.length];
6       dp[0]=nums[0];
7       dp[1]=Math.max(nums[0],nums[1]);
8       for(int i=2;i<nums.length;i++){
9        dp[i]=Math.max(dp[i-1],(dp[i-2]+nums[i]));
10       } 
11       return dp[dp.length-1];
12    }
13}