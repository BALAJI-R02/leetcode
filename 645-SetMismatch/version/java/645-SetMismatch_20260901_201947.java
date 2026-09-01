// Last updated: 9/1/2026, 8:19:47 PM
1class Solution {
2    public int[] findErrorNums(int[] nums) {
3        int dup = -1;
4        int missing = -1; 
5        for (int i = 1; i <= nums.length; i++) {
6            int count = 0;
7            for (int j = 0; j < nums.length; j++) {
8                if (nums[j] == i) 
9                    count++;
10            }
11            if (count == 2) {
12                dup = i;
13            } else if (count == 0) {
14                missing = i;
15            }
16        }   
17        return new int[] {dup, missing};
18    }
19}
20
21