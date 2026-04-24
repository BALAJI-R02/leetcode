// Last updated: 4/24/2026, 1:19:30 PM
1class Solution {
2    public String reverseWords(String s) {
3        String[] words = s.split("\\s+");
4        StringBuilder last = new StringBuilder();
5        for (String word : words) {
6            StringBuilder reversedWord = new StringBuilder(word).reverse();
7            last.append(reversedWord).append(" ");
8        }
9        last.deleteCharAt(last.length() - 1); 
10        return last.toString();        
11    }
12}