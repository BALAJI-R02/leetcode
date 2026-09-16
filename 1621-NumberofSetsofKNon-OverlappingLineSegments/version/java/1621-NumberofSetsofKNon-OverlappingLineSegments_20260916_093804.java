// Last updated: 9/16/2026, 9:38:04 AM
1class Solution {
2
3    public int numberOfSets(int n, int k) {
4
5        long[][] dp = new long[n][k + 1];
6        for (int i = 0; i < n; i++) {
7            dp[i][0] = 1;
8        }
9
10        for (int j = 1; j <= k; j++) {
11
12            long sum = 0;
13
14            for (int i = 1; i < n; i++) {
15
16                sum = (sum + dp[i - 1][j - 1]) % 1000000007;
17
18                dp[i][j] = (dp[i - 1][j] + sum) % 1000000007;
19            }
20        }
21
22        return (int) dp[n - 1][k];
23    }
24}