// Last updated: 9/12/2026, 2:42:25 PM
1class Solution {
2    public int numberOfMatches(int n) {
3        int count = 0;
4        int rev = 0;
5        while(n>1) {
6            rev = n/2;
7            count+=rev;
8            n=n-rev;
9        }
10        return count;
11    }
12}