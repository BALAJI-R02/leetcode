// Last updated: 3/7/2026, 4:18:22 PM
1class Solution {
2    public int diagonalSum(int[][] mat) {
3        int s=0;
4        int w=mat.length;
5        for(int i=0;i<mat.length;i++){
6            s+=mat[i][i];
7            s+=mat[i][w-i-1];
8        }
9        if(w%2!=0)
10        return(s-mat[w/2][w/2]);
11        else
12        return s;
13    }
14}