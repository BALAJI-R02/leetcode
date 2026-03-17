// Last updated: 3/17/2026, 12:26:32 PM
1class Solution {
2    public int[] smallerNumbersThanCurrent(int[] nums) {
3        
4        int arr[]=new int[nums.length];
5        for(int i=0;i<nums.length;i++){
6            int c=0;
7            for(int j=0;j<nums.length;j++){
8                if(nums[i]>nums[j])
9                c++;
10            }
11            arr[i]=c;
12        }
13        return arr;
14    }
15}