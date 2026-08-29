// Last updated: 8/29/2026, 8:33:52 PM
1class Solution {
2    public int numSpecial(int[][] mat) {
3        int a=mat.length;
4        int b=mat[0].length;
5        int row[]=new int[a];
6        int col[]=new int[b];
7        for(int i=0;i<a;i++){
8            for(int j=0;j<b;j++){
9                if(mat[i][j]==1){
10                    row[i]++;
11                    col[j]++;
12                }
13            }
14        }
15        int c=0;
16        for(int i=0;i<a;i++){
17            for(int j=0;j<b;j++){
18                if(mat[i][j]==1 && row[i]==1 && col[j]==1)
19                c++;
20            }
21        }
22        return c;
23    }
24}