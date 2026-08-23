// Last updated: 8/23/2026, 11:45:59 AM
1class Solution {
2    public int longestPalindrome(String s) {
3        Map<Character,Integer> map=new HashMap<>();
4        int oc=0;
5        for(char ch:s.toCharArray()){
6            map.put(ch,map.getOrDefault(ch,0)+1);
7            if(map.get(ch)%2==1)
8            oc++;
9            else
10            oc--;
11        }
12        if(oc>1)
13        return s.length()-oc+1;
14        return s.length();
15    }
16}