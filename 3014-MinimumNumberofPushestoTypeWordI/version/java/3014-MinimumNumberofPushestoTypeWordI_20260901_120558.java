// Last updated: 9/1/2026, 12:05:58 PM
1class Solution {
2    public int minimumPushes(String word) {
3        int ans=0;
4        int push=1;
5        int kw=0;
6        for(int i=0;i<word.length();i++){
7            ans+=push;
8            kw++;
9            if(kw==8){
10                push++;
11                kw=0;
12            }
13        }
14        return ans;
15    }
16}