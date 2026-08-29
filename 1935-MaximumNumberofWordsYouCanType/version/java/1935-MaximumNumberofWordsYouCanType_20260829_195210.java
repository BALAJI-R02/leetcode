// Last updated: 8/29/2026, 7:52:10 PM
1class Solution {
2    public int canBeTypedWords(String text, String brokenLetters) {
3        String arr[] = text.split(" ");
4        int c = 0;
5        for (int i = 0; i < arr.length; i++) {
6            boolean flag = true;
7            for (int j = 0; j < arr[i].length(); j++) {
8                if (brokenLetters.indexOf(arr[i].charAt(j)) != -1) {
9                    flag = false;
10                    break;
11                }
12            }
13            if (flag) {
14                c++;
15            }
16        }
17        return c;
18    }
19}