// Last updated: 8/22/2026, 12:07:01 PM
1class Solution {
2    public List<Integer> luckyNumbers(int[][] matrix) {
3        List<Integer> list=new ArrayList<>();
4        int row[]=new int[matrix.length];
5        int col[]=new int[matrix[0].length];
6        for(int i=0;i<matrix.length;i++){
7            int minr=Integer.MAX_VALUE;
8            for(int j=0;j<matrix[0].length;j++){
9                if(minr>matrix[i][j])
10                minr=matrix[i][j];
11            }
12            row[i]=minr;
13        }
14        for(int j=0;j<matrix[0].length;j++){
15            int maxc=Integer.MIN_VALUE;
16            for(int i=0;i<matrix.length;i++){
17                if(maxc<matrix[i][j])
18                maxc=matrix[i][j];
19            }
20            col[j]=maxc;
21        }
22        for(int i=0;i<row.length;i++)
23        {
24            for(int j=0;j<col.length;j++){
25                if(row[i]==col[j])
26                list.add(row[i]);
27            }
28        }
29        return list;
30    }
31}