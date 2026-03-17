// Last updated: 3/17/2026, 12:16:04 PM
1class Solution {
2    public int countNegatives(int[][] grid) {
3        int c=0;
4        for(int i=0;i<grid.length;i++){
5            for(int j=0;j<grid[0].length;j++){
6                if(grid[i][j]<0)
7                c++;
8            }
9        }
10        return c;
11    }
12}