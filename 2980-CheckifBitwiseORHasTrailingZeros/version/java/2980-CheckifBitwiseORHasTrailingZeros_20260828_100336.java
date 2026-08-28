// Last updated: 8/28/2026, 10:03:36 AM
1class Solution {
2    public boolean hasTrailingZeros(int[] nums) {
3        int c=0;
4        for(int a:nums){
5            if((a&1)==0){
6            if(++c>=2)
7            return true;
8            }
9        }
10        return false;
11    }
12}