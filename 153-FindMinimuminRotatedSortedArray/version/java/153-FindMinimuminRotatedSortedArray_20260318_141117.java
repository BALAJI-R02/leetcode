// Last updated: 3/18/2026, 2:11:17 PM
1class Solution {
2    public int findMin(int[] nums) {
3        int min=Integer.MAX_VALUE;
4        for(int i=0;i<nums.length;i++){
5            if(nums[i]<min)
6            min=nums[i];
7        }
8        return min;
9    }
10}