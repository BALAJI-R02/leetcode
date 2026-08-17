// Last updated: 8/17/2026, 8:31:03 PM
1class Solution {
2    private int gcd(int a,int b){
3        while(b!=0){
4            int temp=b;
5            b=a%b;
6            a=temp;
7        }
8        return a;
9    }
10    public int findGCD(int[] nums) {
11        Arrays.sort(nums);
12        int min=nums[0];
13        int max=nums[nums.length-1];
14        return gcd(min,max);
15    }
16}