// Last updated: 9/15/2026, 7:45:41 PM
1class Solution {
2    public String sortSentence(String s) {
3        String[] words = s.split("\\s+");
4        String[] sorted = new String[words.length];
5        for (String word : words) {
6            int n = word.length();
7            int i = word.charAt(n - 1) - '0' - 1;
8            sorted[i] = word.substring(0, n - 1);
9        }
10        return String.join(" ", sorted);
11    }
12}