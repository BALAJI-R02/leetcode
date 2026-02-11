// Last updated: 2/11/2026, 2:00:31 PM
class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int c=0;
        int ma=0;
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]==1)
            {
                c++;
            }
            else
            c=0;
            if(c>ma)
            ma=c;
        }
    return ma;
    }
}