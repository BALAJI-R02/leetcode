// Last updated: 9/17/2026, 8:01:40 PM
1class Solution {
2    public int smallestNumber(int n, int t) {
3        while (true) {
4            int num = n;
5            int product = 1;
6            while (num > 0) {
7                int digit = num % 10;
8                product = product * digit;
9                num = num / 10;
10            }
11            if (product % t == 0) 
12                return n;
13            n++;
14        }
15    }
16}