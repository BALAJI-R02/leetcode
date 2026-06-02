// Last updated: 6/2/2026, 11:55:18 AM
1class Solution {
2    public int longestCommonSubsequence(String text1, String text2) {
3        int m=text1.length();
4        int n=text2.length();
5        int [][]dp=new int[m+1][n+1];
6        for(int i=1;i<=m;i++){
7            for(int j=1;j<=n;j++){
8                if(text1.charAt(i-1)==text2.charAt(j-1)){
9                    dp[i][j]=1+dp[i-1][j-1];
10                }
11                else
12                dp[i][j]=Math.max(dp[i-1][j],dp[i][j-1]);
13            }
14        }
15        return dp[m][n];
16    }
17}