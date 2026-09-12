// Last updated: 9/12/2026, 9:58:16 AM
1class Solution {
2    public String minWindow(String s, String t) {
3        int freq[]=new int[128];
4        for(char c:t.toCharArray())
5        freq[c]++;
6        int l=0;
7        int min=s.length()+1;
8        int start=0;
9        int count=t.length();
10        for(int r=0;r<s.length();r++){
11            char c=s.charAt(r);
12            if(freq[c]>0){
13                count--;
14            }
15            freq[c]--;
16            while(count==0){
17                if(r-l+1<min){
18                    min=r-l+1;
19                    start=l;
20                }
21                char x=s.charAt(l);
22                freq[x]++;
23                if(freq[x]>0)
24                count++;
25                l++;
26            }
27        } 
28        if(min==s.length()+1)
29        return "";
30        else
31        return s.substring(start,start+min);
32    }
33}