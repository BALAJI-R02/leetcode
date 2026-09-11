// Last updated: 9/11/2026, 3:39:09 PM
1import java.util.*;
2
3class Solution {
4    public int firstMissingPositive(int[] nums) {
5        HashSet<Integer> set = new HashSet<>();
6        for (int i = 0; i < nums.length; i++) 
7            set.add(nums[i]);
8        for (int i = 1; i <= nums.length + 1; i++) {
9            if (!set.contains(i)) 
10                return i;         
11        }
12        return -1;
13    }
14}