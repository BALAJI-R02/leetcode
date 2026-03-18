// Last updated: 3/18/2026, 2:21:23 PM
class Solution {
    public int maxSubArray(int[] nums) {
        int sum = 0;
        int maxsum = Integer.MIN_VALUE;
        for(int i = 0 ; i < nums.length ; i++){
            sum += nums[i];
            maxsum = sum>maxsum?sum:maxsum;
            sum=sum<=0?0:sum;
        }
        return maxsum;
    }
}