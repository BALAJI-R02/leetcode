// Last updated: 9/10/2026, 2:50:30 PM
1class Solution {
2    public boolean canJump(int[] nums) {
3        int op=0;
4        for(int i=0;i<nums.length;i++){
5            if(i>op)
6            return false;
7            op=Math.max(op,i+nums[i]);
8        }
9        return true;
10    }
11}