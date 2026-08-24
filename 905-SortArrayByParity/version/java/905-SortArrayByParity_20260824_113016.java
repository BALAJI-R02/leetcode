// Last updated: 8/24/2026, 11:30:16 AM
1class Solution {
2    public int[] sortArrayByParity(int[] nums) {
3        int[] arr = new int[nums.length];
4        int j = 0;
5        for (int i = 0; i < nums.length; i++) {
6            if (nums[i] % 2 == 0) {
7                arr[j] = nums[i];
8                j++;
9            }
10        }
11        for (int i = 0; i < nums.length; i++) {
12            if (nums[i] % 2 != 0) {
13                arr[j] = nums[i];
14                j++;
15            }
16        }
17        return arr;
18    }
19}