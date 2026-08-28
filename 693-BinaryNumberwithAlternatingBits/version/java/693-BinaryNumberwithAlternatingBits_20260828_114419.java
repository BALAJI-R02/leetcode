// Last updated: 8/28/2026, 11:44:19 AM
1class Solution {
2    public boolean hasAlternatingBits(int n) {
3        int prev = n % 2;
4        n = n / 2;
5        while (n != 0) {
6            int curr = n % 2;
7            if (curr == prev) 
8                return false;
9            prev = curr;
10            n = n / 2;
11        }
12        return true;
13    }
14}