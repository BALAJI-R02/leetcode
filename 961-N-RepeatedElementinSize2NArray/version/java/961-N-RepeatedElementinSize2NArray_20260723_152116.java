// Last updated: 7/23/2026, 3:21:16 PM
1class Solution {
2    public int repeatedNTimes(int[] nums) {
3        int c=0;
4        int a=0;
5        for(int i=0;i<nums.length;i++){
6            c=0;
7            for(int j=i;j<nums.length;j++){
8                if(nums[i]==nums[j]){
9                    c++;
10                }
11
12            }
13            if(c==nums.length/2)
14            return nums[i];
15        }
16        return -1;
17    }
18}