// Last updated: 9/1/2026, 12:16:35 PM
1class Solution {
2    public int countBattleships(char[][] board) {
3        if (board.length == 0 || board[0].length == 0) 
4            return 0;
5        int rows = board.length;
6        int cols = board[0].length;
7        int count = 0;
8        for (int i = 0; i < rows; i++) {
9            for (int j = 0; j < cols; j++) {
10                if (board[i][j] == 'X'
11						&& (j == cols - 1 || board[i][j + 1] == '.')
12                        && (i == rows - 1 || board[i + 1][j] == '.')) {
13                    count++;
14                }
15            }
16        }
17        return count;
18    }
19}