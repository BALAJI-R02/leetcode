// Last updated: 9/11/2026, 11:52:45 AM
1class Solution {
2    public boolean isMatch(String s, String p) {
3        return match(s, p, 0, 0);
4    }
5    private boolean match(String s, String p, int i, int j) {
6        if (j == p.length()) {
7            return i == s.length();
8        }
9        boolean firstMatch = i < s.length() &&
10                (s.charAt(i) == p.charAt(j) ||
11                 p.charAt(j) == '.');
12        if (j + 1 < p.length() && p.charAt(j + 1) == '*') {
13            boolean skip = match(s, p, i, j + 2);
14            boolean take = firstMatch &&
15                    match(s, p, i + 1, j);
16
17            return skip || take;
18        }
19        return firstMatch &&
20                match(s, p, i + 1, j + 1);
21    }
22}