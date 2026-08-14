// Last updated: 8/14/2026, 12:13:03 PM
1class Solution {
2    public String addSpaces(String s, int[] spaces) {
3        StringBuilder res=new StringBuilder();
4        int j=0;
5        for(int i=0;i<s.length();i++){
6            if(j<spaces.length && i==spaces[j]){
7            res.append(" ");
8            j++;
9            }
10            res.append(s.charAt(i));
11        }
12        return res.toString();
13    }
14}