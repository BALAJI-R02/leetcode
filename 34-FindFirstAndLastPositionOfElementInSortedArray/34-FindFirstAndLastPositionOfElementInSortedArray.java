// Last updated: 2/11/2026, 2:01:33 PM
class Solution {
    public int[] searchRange(int[] nums, int target) {
        int i=0,j=nums.length-1;
        while(i<=j){
            if(nums[i]==target && nums[j]==target) return new int[]{i,j};
            if(nums[i]!=target) i++;
            if(nums[j]!=target) j--;
        }
        return new int[]{-1,-1};
    }
}