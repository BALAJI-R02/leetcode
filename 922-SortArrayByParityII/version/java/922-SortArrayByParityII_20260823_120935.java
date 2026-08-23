// Last updated: 8/23/2026, 12:09:35 PM
1class Solution {
2    public int[] sortArrayByParityII(int[] nums) {
3        int [] arr=new int[nums.length];
4        int even=0;
5        int odd=1;
6        for(int i=0;i<nums.length;i++){
7            if(nums[i]%2==0){
8            arr[even]=nums[i];
9            even+=2;
10            }
11            else{
12            arr[odd]=nums[i];
13            odd+=2;
14            }
15        }
16        return arr;
17    }
18}