// Last updated: 8/29/2026, 1:32:13 PM
1class Solution {
2    public int maxLengthBetweenEqualCharacters(String s) {
3        int max = -1;
4        for (int i = 0; i < s.length(); i++) {
5            for (int j = i + 1; j < s.length(); j++) {
6                if (s.charAt(i) == s.charAt(j)) 
7                    max = Math.max(max, j - i - 1);               
8            }
9        }
10        return max;
11    }
12}