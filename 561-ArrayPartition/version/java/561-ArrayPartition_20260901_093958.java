// Last updated: 9/1/2026, 9:39:58 AM
1class Solution {
2    public int arrayPairSum(int[] nums) {
3        Arrays.sort(nums);
4        int s=0;
5        for(int i=0;i<nums.length;i+=2)
6        s+=nums[i];
7        return s;
8    }
9}