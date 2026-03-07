// Last updated: 3/7/2026, 4:23:27 PM
1class Solution {
2    public int[][] construct2DArray(int[] original, int m, int n) {
3       if(original.length!=m*n)
4       return new int[0][0];
5       int arr[][]=new int[m][n];
6       for(int i=0;i<original.length;i++){
7        int row=i/n;
8        int col=i%n;
9        arr[row][col]=original[i];
10       } 
11       return arr;
12    }
13}