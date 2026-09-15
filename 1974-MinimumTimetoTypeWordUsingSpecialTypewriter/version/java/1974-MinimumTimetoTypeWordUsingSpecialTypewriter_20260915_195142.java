// Last updated: 9/15/2026, 7:51:42 PM
1class Solution {
2        public int minTimeToType(String word) {
3        int cnt = word.length();
4        char prev = 'a';
5        for (int i = 0; i < word.length(); ++i) {
6            char cur = word.charAt(i);
7            int diff = Math.abs(cur - prev);
8            cnt += Math.min(diff, 26 - diff);
9            prev = cur;
10        }
11        return cnt;
12    }
13}