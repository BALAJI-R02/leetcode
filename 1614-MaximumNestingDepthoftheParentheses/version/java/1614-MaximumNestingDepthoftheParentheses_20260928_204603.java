// Last updated: 9/28/2026, 8:46:03 PM
1class Solution {
2    public int maxDepth(String s) {
3        int d = 0;
4        int r = 0;
5        for (char c : s.toCharArray()) {
6            if (c == ')') {
7                d--;
8                continue;
9            }
10            if (c != '(') 
11            continue;
12            d++;
13            if (d > r) 
14            r = d;
15        }
16        return r;
17    }
18}