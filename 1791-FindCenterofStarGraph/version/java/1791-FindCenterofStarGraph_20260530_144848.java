// Last updated: 5/30/2026, 2:48:48 PM
1class Solution {
2    public int findCenter(int[][] edges) {
3        int a=edges[0][0];
4        int b=edges[0][1];
5        int c=edges[1][0];
6        int d=edges[1][1];
7        if(a==c || a==d)
8        return a;
9        return b;
10    }
11}