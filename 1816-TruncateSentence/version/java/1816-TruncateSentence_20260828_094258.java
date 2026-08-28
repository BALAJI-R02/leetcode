// Last updated: 8/28/2026, 9:42:58 AM
1class Solution {
2    public String truncateSentence(String s, int k) {
3        String arr[]=s.split(" ");
4        String [] str=new String[k];
5        for(int i=0;i<k;i++){
6            str[i]=arr[i];
7        }
8        String res=String.join(" ",str);
9        return res;
10    }
11}