// Last updated: 2/11/2026, 2:01:12 PM
class Solution {
    public int majorityElement(int[] nums) {
        int t=nums[0];
        int c=0;
        for(int i=0;i<nums.length;i++){
            if(c==0)
            t=nums[i];
            if(t==nums[i]){
                c++;
            }
            else{
                c--;
            }
        }
        return t;
    }
}