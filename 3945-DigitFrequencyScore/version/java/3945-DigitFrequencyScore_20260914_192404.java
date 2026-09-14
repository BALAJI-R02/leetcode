// Last updated: 9/14/2026, 7:24:04 PM
1class Solution {
2    public int digitFrequencyScore(int n) {
3        int[] freq = new int[10];
4        while (n > 0) {
5            int digit = n % 10;
6            freq[digit]++;
7            n = n / 10;
8        }
9        int ans = 0;
10        for (int i = 0; i < 10; i++) 
11            ans = ans + i * freq[i];
12        return ans;
13    }
14}