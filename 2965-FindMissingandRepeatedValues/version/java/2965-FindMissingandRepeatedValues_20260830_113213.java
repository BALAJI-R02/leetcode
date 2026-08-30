// Last updated: 8/30/2026, 11:32:13 AM
1class Solution {
2    public int[] findMissingAndRepeatedValues(int[][] grid) {
3        int a=grid.length;
4        int size=a*a;
5        int [] freq=new int[size+1];
6        for(int i=0;i<grid.length;i++){
7            for(int j=0;j<grid[0].length;j++){
8                freq[grid[i][j]]++;
9            }
10        }
11        int re=-1;
12        int mi=-1;
13        for(int i=1;i<=size;i++){
14            if(freq[i]==2)
15            re=i;
16            if(freq[i]==0)
17            mi=i;
18        }
19        return new int[]{re,mi};
20    }
21}