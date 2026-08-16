// Last updated: 8/16/2026, 1:41:14 PM
1class Solution {
2    public int[][] transpose(int[][] matrix) {
3        int [][]arr=new int[matrix[0].length][matrix.length];
4        for(int i=0;i<matrix.length;i++){
5            for(int j=0;j<matrix[0].length;j++){
6                arr[j][i]=matrix[i][j];
7            }
8        }
9        return arr;
10    }
11}