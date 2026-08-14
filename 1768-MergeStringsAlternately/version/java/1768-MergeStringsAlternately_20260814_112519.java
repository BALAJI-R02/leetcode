// Last updated: 8/14/2026, 11:25:19 AM
1class Solution {
2    public String mergeAlternately(String word1, String word2) {
3        String res="";
4        //int c= word1.length()+word2.length();
5        int min=Math.min(word1.length(),word2.length());
6        for(int i=0;i<min;i++){
7            res+=word1.charAt(i);
8            res+=word2.charAt(i);
9        }
10        res+=word1.substring(min);
11        res+=word2.substring(min);
12        return res;
13    }
14}