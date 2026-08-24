// Last updated: 8/24/2026, 12:30:53 PM
1class Solution {
2    public int smallestEqual(int[] nums) {
3        int c=500;
4        for(int i=0;i<nums.length;i++){
5            if(i%10==nums[i])
6            return i;
7        }
8        return -1;
9    }
10}