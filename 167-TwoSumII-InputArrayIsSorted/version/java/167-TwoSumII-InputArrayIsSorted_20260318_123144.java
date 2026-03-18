// Last updated: 3/18/2026, 12:31:44 PM
1class Solution {
2    public int[] twoSum(int[] numbers, int target) {
3        int start = 0;
4        int end = numbers.length - 1;
5        while(start < end){
6            int sum = numbers[start] + numbers[end];
7            if(sum == target)
8                return new int[]{start + 1, end + 1};
9            else if(sum < target)
10                start++;
11            else
12                end--;
13        }
14
15        return new int[]{-1, -1};
16    }
17}