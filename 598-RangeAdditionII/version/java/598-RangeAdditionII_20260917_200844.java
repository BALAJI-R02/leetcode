// Last updated: 9/17/2026, 8:08:44 PM
1class Solution {
2    public int maxCount(int m, int n, int[][] ops) {
3        int a=m;
4        int b=n;
5        for(int i=0;i<ops.length;i++){
6            int x=ops[i][0];
7            int y=ops[i][1];
8            a=Math.min(a, x);
9            b=Math.min(b, y);
10        }
11        return a * b;
12    }
13}