// Last updated: 8/24/2026, 12:21:49 PM
1class Solution {
2    public int maximumDifference(int[] nums) {
3        int diff=Integer.MIN_VALUE;
4        int max=-1;
5        for(int i=0;i<nums.length;i++){
6            for(int j=i+1;j<nums.length;j++){
7                if(nums[j]>nums[i])
8                diff=nums[j]-nums[i];
9                max=Math.max(diff,max);
10            }
11            
12        }
13        return max;
14    }
15}