// Last updated: 9/10/2026, 3:50:26 PM
1import java.math.BigInteger;
2class Solution {
3    public String kthLargestNumber(String[] nums, int k) {
4        BigInteger arr[]=new BigInteger[nums.length];
5        for(int i=0;i<nums.length;i++){
6            arr[i]=new BigInteger(nums[i]);
7        }
8        Arrays.sort(arr);
9        return arr[arr.length-k].toString();
10    }
11}