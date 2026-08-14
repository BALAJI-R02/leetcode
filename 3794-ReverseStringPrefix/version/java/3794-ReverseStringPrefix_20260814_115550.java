// Last updated: 8/14/2026, 11:55:50 AM
1class Solution {
2    public String reversePrefix(String s, int k) {
3        String res="";
4        for(int i=k-1;i>=0;i--){
5            res+=s.charAt(i);
6        }
7        res+=s.substring(k);
8        return res;
9    }
10}