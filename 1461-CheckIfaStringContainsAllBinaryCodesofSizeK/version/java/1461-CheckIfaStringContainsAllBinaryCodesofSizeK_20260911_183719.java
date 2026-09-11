// Last updated: 9/11/2026, 6:37:19 PM
1import java.util.*;
2
3class Solution {
4    public boolean hasAllCodes(String s, int k) {
5
6        HashSet<String> set = new HashSet<>();
7
8        for (int i = 0; i <= s.length() - k; i++) {
9
10            String sub = s.substring(i, i + k);
11
12            set.add(sub);
13        }
14
15        return set.size() == (1 << k);
16    }
17}