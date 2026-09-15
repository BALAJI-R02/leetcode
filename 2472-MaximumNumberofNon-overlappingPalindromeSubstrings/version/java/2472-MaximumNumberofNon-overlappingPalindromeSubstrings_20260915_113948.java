// Last updated: 9/15/2026, 11:39:48 AM
1class Solution {
2
3    public int maxPalindromes(String s, int k) {
4
5        int n = s.length();
6
7        boolean[][] palindrome = new boolean[n][n];
8
9        for (int i = n - 1; i >= 0; i--) {
10
11            for (int j = i; j < n; j++) {
12
13                if (s.charAt(i) == s.charAt(j)) {
14
15                    if (j - i <= 1 || palindrome[i + 1][j - 1]) {
16                        palindrome[i][j] = true;
17                    }
18                }
19            }
20        }
21
22        int[] dp = new int[n + 1];
23
24        for (int i = n - 1; i >= 0; i--) {
25
26            dp[i] = dp[i + 1];
27
28            for (int j = i + k - 1; j < n; j++) {
29
30                if (palindrome[i][j]) {
31
32                    dp[i] = Math.max(
33                        dp[i],
34                        1 + dp[j + 1]
35                    );
36                }
37            }
38        }
39
40        return dp[0];
41    }
42}