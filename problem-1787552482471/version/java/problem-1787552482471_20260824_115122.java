// Last updated: 8/24/2026, 11:51:22 AM
1class Solution {
2    public String reversePrefix(String word, char ch) {
3        String res="";
4        //String op="";
5        //int t=-1;
6        for(int i=0;i<word.length();i++){
7            if(word.charAt(i)==ch){
8                res+=word.substring(0,i+1);
9                StringBuilder rev=new StringBuilder(res);
10                rev.reverse();
11                String op=word.substring(i+1);
12            return rev.toString()+op;
13            }
14        }
15        return word;
16    }
17}