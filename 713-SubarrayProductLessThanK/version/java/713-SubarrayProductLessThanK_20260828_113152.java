// Last updated: 8/28/2026, 11:31:52 AM
1class Solution {
2    public int numSubarrayProductLessThanK(int[] nums, int k) {
3
4        int c = 0;
5        int a = nums.length;
6
7        for (int i = 0; i < a; i++) {
8
9            int prod = 1;
10
11            for (int j = i; j < a; j++) {
12
13                prod = prod * nums[j];
14
15                if (prod < k)
16                    c++;
17                else
18                    break;
19            }
20        }
21
22        return c;
23    }
24}