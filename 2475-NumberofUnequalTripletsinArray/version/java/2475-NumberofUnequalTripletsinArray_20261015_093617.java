// Last updated: 10/15/2026, 9:36:17 AM
1class Solution {
2    public int unequalTriplets(int[] nums) {
3        int count = 0;
4        int n = nums.length;
5        for (int i = 0; i < n; i++) {
6            for (int j = i + 1; j < n; j++) {
7                for (int k = j + 1; k < n; k++) {
8                    if (nums[i] != nums[j] &&
9                        nums[j] != nums[k] &&
10                        nums[i] != nums[k]) {
11                        count++;
12                    }
13                }
14            }
15        }
16        return count;
17    }
18}
19