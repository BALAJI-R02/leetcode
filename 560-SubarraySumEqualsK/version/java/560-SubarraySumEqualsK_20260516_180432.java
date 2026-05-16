// Last updated: 5/16/2026, 6:04:32 PM
1public class Solution {
2    public int subarraySum(int[] nums, int k) {
3        int count = 0;
4        int[] sum = new int[nums.length + 1];
5        sum[0] = 0;
6        for (int i = 1; i <= nums.length; i++)
7            sum[i] = sum[i - 1] + nums[i - 1];     
8        for (int start = 0; start < sum.length; start++) {
9            for (int end = start + 1; end < sum.length; end++) {
10                if (sum[end] - sum[start] == k)
11                    count++;
12            }
13        }    
14        return count;
15    }
16}