// Last updated: 8/19/2026, 12:21:15 PM
1class Solution {
2    public int dominantIndex(int[] nums) {
3        int m=Integer.MIN_VALUE;
4        int ind=-1;
5        for(int i=0;i<nums.length;i++){
6            if(nums[i]>m){
7                m=nums[i];
8                ind=i;
9            }
10        }
11        for(int i=0;i<nums.length;i++){
12            if(i!=ind && nums[i]*2>m)
13            return -1;
14        }
15        return ind;
16    }
17}