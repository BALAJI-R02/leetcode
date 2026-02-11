// Last updated: 2/11/2026, 2:00:57 PM
class Solution {
    public int missingNumber(int[] nums) {
       int n=nums.length;
       int a=n*(n+1)/2;
       int b=0;
       for(int i=0;i<nums.length;i++){
        b=b+nums[i];
       } 
       return a-b;
    }
}