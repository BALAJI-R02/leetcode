// Last updated: 8/16/2026, 1:09:26 PM
1class Solution {
2    public String restoreString(String s, int[] indices) {
3        StringBuilder str=new StringBuilder();
4        char c[]=new char[s.length()];
5        for(int i=0;i<s.length();i++){
6            c[indices[i]]=s.charAt(i);
7        }
8        str.append(c);
9        return str.toString();
10    }
11}