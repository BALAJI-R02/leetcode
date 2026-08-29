// Last updated: 8/29/2026, 1:22:24 PM
1class Solution {
2    public boolean arrayStringsAreEqual(String[] word1, String[] word2) {
3        String res="";
4        for(String k:word1)
5        res+=k;
6        String op="";
7        for(String k:word2)
8        op+=k;
9        if(res.equals(op))
10        return true;
11        return false;
12    }
13}