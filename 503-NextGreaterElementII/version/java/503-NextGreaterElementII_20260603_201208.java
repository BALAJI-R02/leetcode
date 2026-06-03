// Last updated: 6/3/2026, 8:12:08 PM
1class Solution {
2    public int[] nextGreaterElements(int[] nums) {
3        int n = nums.length;
4        int[] arr = new int[n];
5        for (int i = 0; i < n; i++) {
6            arr[i] = -1; 
7            for (int step = 1; step < n; step++) {
8                int index = (i + step) % n;
9                if (nums[index] > nums[i]) {
10                    arr[i] = nums[index];
11                    break; 
12                }
13            }
14        }
15        return arr;
16    }
17}