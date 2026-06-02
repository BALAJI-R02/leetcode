// Last updated: 6/2/2026, 5:59:37 PM
1class Solution {
2    public int minPathSum(int[][] grid) {
3        int m=grid.length;
4        int n=grid[0].length;
5        //int dp[][]=new int[m+1][n+1];
6        for(int i=1;i<m;i++)
7        grid[i][0]=grid[i][0]+grid[i-1][0];
8        for(int j=1;j<n;j++)
9        grid[0][j]=grid[0][j]+grid[0][j-1];
10        for(int i=1;i<m;i++){
11            for(int j=1;j<n;j++){
12                grid[i][j]=grid[i][j]+Math.min(grid[i-1][j],grid[i][j-1]);
13            }
14        }
15        return grid[m-1][n-1];
16    }
17}