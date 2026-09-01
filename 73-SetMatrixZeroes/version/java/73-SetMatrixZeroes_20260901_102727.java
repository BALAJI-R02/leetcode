// Last updated: 9/1/2026, 10:27:27 AM
1class Solution {
2    public void setZeroes(int[][] matrix) {
3        int rows = matrix.length;
4        int cols = matrix[0].length;
5        boolean firstRow = false;
6        boolean firstCol = false;
7        for (int j = 0; j < cols; j++) {
8            if (matrix[0][j] == 0) {
9                firstRow = true;
10            }
11        }
12        for (int i = 0; i < rows; i++) {
13            if (matrix[i][0] == 0) {
14                firstCol = true;
15            }
16        }
17        for (int i = 1; i < rows; i++) {
18            for (int j = 1; j < cols; j++) {
19
20                if (matrix[i][j] == 0) {
21                    matrix[i][0] = 0;
22                    matrix[0][j] = 0;
23                }
24            }
25        }
26        for (int i = 1; i < rows; i++) {
27            if (matrix[i][0] == 0) {
28
29                for (int j = 1; j < cols; j++) {
30                    matrix[i][j] = 0;
31                }
32            }
33        }
34        for (int j = 1; j < cols; j++) {
35            if (matrix[0][j] == 0) {
36
37                for (int i = 1; i < rows; i++) {
38                    matrix[i][j] = 0;
39                }
40            }
41        }
42        if (firstRow) {
43            for (int j = 0; j < cols; j++) {
44                matrix[0][j] = 0;
45            }
46        }
47        if (firstCol) {
48            for (int i = 0; i < rows; i++) {
49                matrix[i][0] = 0;
50            }
51        }
52    }
53}