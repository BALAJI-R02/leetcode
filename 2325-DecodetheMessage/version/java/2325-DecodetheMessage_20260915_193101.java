// Last updated: 9/15/2026, 7:31:01 PM
1class Solution {
2    public String decodeMessage(String key, String message) {
3        char arr[]=new char[26];
4        int i=0;
5        for(char ch:key.toCharArray())
6        {
7            if(ch!=' ' && arr[ch-'a']=='\0')
8            {
9                arr[ch-'a']=(char)('a'+i);
10                i++;
11            }
12        }
13        StringBuilder sb=new StringBuilder();
14        for(char c:message.toCharArray())
15        {
16            if(c!=' ')
17            {
18                sb.append(arr[c-'a']);
19            }
20            else
21            {
22                sb.append(" ");
23            }
24        }
25        return sb.toString();
26    }
27}