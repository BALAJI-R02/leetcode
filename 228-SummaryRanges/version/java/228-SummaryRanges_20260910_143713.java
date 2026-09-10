// Last updated: 9/10/2026, 2:37:13 PM
1import java.util.ArrayList;
2import java.util.List;
3
4class Solution {
5    public List<String> summaryRanges(int[] nums) {
6        List<String> result = new ArrayList<>();
7        if (nums.length == 0) 
8            return result;     
9        int i = 0;
10        while (i < nums.length) {
11            int start = nums[i];
12            int j = i;
13            while (j + 1 < nums.length && nums[j + 1] == nums[j] + 1) {
14                j++;
15            }
16            if (nums[j] == start) {
17                result.add(String.valueOf(start));
18            } else {
19                result.add(start + "->" + nums[j]);
20            }
21            i = j + 1;
22        }
23        return result;
24    }
25}