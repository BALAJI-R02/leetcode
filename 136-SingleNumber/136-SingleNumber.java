// Last updated: 2/11/2026, 2:01:14 PM
class Solution {
    public int singleNumber(int[] nums) {
        int n = nums.length;
        int num=0;
        for(int i=0;i<n;i++)
        {
            num = num^nums[i];
        }

        return num;
    }
}