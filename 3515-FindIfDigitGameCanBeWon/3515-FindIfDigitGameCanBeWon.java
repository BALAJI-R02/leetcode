// Last updated: 2/11/2026, 1:59:40 PM
class Solution {
    public boolean canAliceWin(int[] nums) {
        int s1=0;
        int s2=0;
        int []arr=new int[nums.length];
        int []arr1=new int[nums.length];
        for(int i=0;i<nums.length;i++){
            if(nums[i]>9)
            arr[i]=nums[i];
            else
            arr1[i]=nums[i];
        }
        for(int i=0;i<arr.length;i++)
        s1=s1+arr[i];
        for(int i=0;i<arr1.length;i++)
        s2=s2+arr1[i];
        if(s1>s2 || s2>s1)
        return true;
        return false;
    }
}