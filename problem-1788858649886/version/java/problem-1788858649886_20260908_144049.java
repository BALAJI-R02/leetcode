// Last updated: 9/8/2026, 2:40:49 PM
1class Solution {
2    public int firstStableIndex(int[] nums, int k) {
3        int m=Integer.MAX_VALUE;
4        int arr[]=new int[nums.length];
5        for(int i=nums.length-1;i>=0;i--){
6            m=Math.min(m,nums[i]);
7            arr[i]=m;
8        }
9        int ans=Integer.MIN_VALUE;
10        for(int i=0;i<nums.length;i++){
11            ans=Math.max(ans,nums[i]);
12            int val=ans-arr[i];
13            if(val<=k){
14                return i;
15            }
16        }
17        return -1;
18    }
19}