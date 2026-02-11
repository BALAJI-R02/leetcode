// Last updated: 2/11/2026, 2:01:07 PM
class Solution {
    public int rob(int[] nums) {
        int p1=0,p2=0,sum;
        for(int i:nums)
        {
            sum=p1;
            p1=Math.max(p1,p2+i);
            p2=sum;
        }
        
        return p1;
    }
}