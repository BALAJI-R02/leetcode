// Last updated: 9/11/2026, 6:40:53 PM
1class Solution {
2    public int maximumLengthSubstring(String s) {
3        int max = 0;
4        for (int i = 0; i < s.length(); i++) {
5            int[] count = new int[26];
6            for (int j = i; j < s.length(); j++) {
7                int index = s.charAt(j) - 'a';
8                count[index]++;
9                if (count[index] > 2) 
10                    break;
11                max = Math.max(max, j - i + 1);
12            }
13        }
14        return max;
15    }
16}