// Last updated: 8/16/2026, 1:34:02 PM
1class Solution {
2    public int countSegments(String s) {
3        int c=0;
4        String str[]=s.split(" ");
5        for(String q:str){
6            if(!q.isEmpty())
7            c++;
8        }
9        return c;
10    }
11}