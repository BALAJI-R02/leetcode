// Last updated: 2/11/2026, 2:00:23 PM
class Solution {
    public int search(int[] nums, int target) {
        int a=nums.length;
        int f=0;
        int l=a-1;
        
        while(f<=l){
            int m=(f+l)/2;
            if(nums[m]==target)
            return m;
            else if(target<nums[m])
            l=m-1;
            else
            f=m+1;
        }
        return -1;            
        
    }
}