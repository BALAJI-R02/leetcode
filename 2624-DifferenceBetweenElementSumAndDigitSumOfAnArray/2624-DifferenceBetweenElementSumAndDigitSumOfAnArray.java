// Last updated: 2/11/2026, 1:59:55 PM
class Solution {
    public int differenceOfSum(int[] nums) {
        int s1=0;
        for(int i=0;i<nums.length;i++){
            s1=s1+nums[i];
        }
        int s2=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]>=10){
                int a=nums[i];
                while(a!=0){
                    int d=a%10;
                    s2=s2+d;
                    a=a/10;
                }
            }
            else
            s2=s2+nums[i];
        }
        int r=s1-s2;
        return r;
    }
}