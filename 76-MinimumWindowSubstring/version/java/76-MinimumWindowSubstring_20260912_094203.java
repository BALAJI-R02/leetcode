// Last updated: 9/12/2026, 9:42:03 AM
1class Solution {
2    public String minWindow(String s, String t) {
3        int freq[]=new int[128];
4        for(char c:t.toCharArray())
5        freq[c]++;
6        int count=t.length();
7        int min=s.length()+1;
8        int left=0;
9        int start=0;
10        for(int right=0;right<s.length();right++){
11            char c=s.charAt(right);
12            if(freq[c]>0){
13                count--;
14            }
15            freq[c]--;
16            while(count==0){
17                if(right-left+1<min){
18                    min=right-left+1;
19                    start=left;
20                }
21                char x=s.charAt(left);
22                freq[x]++;
23                if(freq[x]>0){
24                    count++;
25                }
26                left++;
27            }
28        }
29        if(min==s.length()+1)
30        return "";
31        else
32        return s.substring(start,start+min); 
33    }
34}