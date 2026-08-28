// Last updated: 8/28/2026, 11:33:24 AM
1class Solution {
2    public int numSubarrayProductLessThanK(int[] nums, int k) {
3        int c=0;
4        int a=nums.length;
5        for(int i=0;i<a;i++){
6            int prod=1;
7            for(int j=i;j<a;j++){
8                prod=prod*nums[j];
9                if(prod<k)
10                c++;
11                else 
12                break;
13            }
14        }
15        return c;
16    }
17}