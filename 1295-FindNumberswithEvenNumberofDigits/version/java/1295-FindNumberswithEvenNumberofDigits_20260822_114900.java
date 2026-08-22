// Last updated: 8/22/2026, 11:49:00 AM
1class Solution {
2    public int findNumbers(int[] nums) {
3        int c=0;
4        for(int i=0;i<nums.length;i++){
5            int numc=0;
6            int a=nums[i];
7            while(a!=0){
8                int dig=a%10;
9                numc++;
10                a=a/10;
11            }
12            if(numc%2==0)
13            c++;
14        }
15        return c;
16    }
17}