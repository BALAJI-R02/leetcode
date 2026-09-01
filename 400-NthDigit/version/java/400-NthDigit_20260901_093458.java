// Last updated: 9/1/2026, 9:34:58 AM
1class Solution {
2    public int findNthDigit(int n) {
3        long digitLength = 1;
4        long count = 9;
5        long start = 1;
6        while (n > digitLength * count) {
7            n -= digitLength * count;
8            digitLength++;
9            count *= 10;
10            start *= 10;
11        }
12        start += (n - 1) / digitLength;
13        String num = Long.toString(start);
14        return num.charAt((int)((n - 1) % digitLength)) - '0';
15    }
16}