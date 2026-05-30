// Last updated: 5/30/2026, 2:40:22 PM
1class Solution {
2    public int numIslands(char[][] grid) {
3        int c=0;
4        int row=grid.length;
5        int coloumn=grid[0].length;
6        for(int i=0;i<row;i++){
7            for(int j=0;j<coloumn;j++){
8                if(grid[i][j]=='1'){
9                    c++;
10                    dfs(grid,i,j);
11                }
12            }
13        }
14        return c;
15    }
16        void dfs(char grid[][],int i,int j){
17            if(i<0 || j<0 || i>=grid.length || j>=grid[0].length || grid[i][j]=='0')
18                return;
19        grid[i][j]='0';
20        dfs(grid,i,j+1);
21        dfs(grid,i,j-1);
22        dfs(grid,i+1,j);
23        dfs(grid,i-1,j);
24        
25    }
26}