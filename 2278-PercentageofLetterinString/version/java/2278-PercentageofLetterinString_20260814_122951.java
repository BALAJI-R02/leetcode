// Last updated: 8/14/2026, 12:29:51 PM
1class Solution {
2    public int percentageLetter(String s, char letter) {
3        int count = 0;
4        int op = 0;
5        for (int i = 0; i < s.length(); i++) {
6            char c = s.charAt(i);
7            if (c == letter) {
8                count++;
9            }
10        }
11        op = count * 100 / s.length();
12        return op;
13    }
14}