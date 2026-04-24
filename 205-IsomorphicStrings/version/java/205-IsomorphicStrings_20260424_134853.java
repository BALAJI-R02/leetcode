// Last updated: 4/24/2026, 1:48:53 PM
1class Solution {
2    public boolean isIsomorphic(String s, String t) {
3        int[] indexofs = new int[256]; 
4        int[] indexoft = new int[256];
5        if(s.length() != t.length()) {
6            return false;
7        }
8        for(int i = 0; i < t.length(); i++) {
9            if(indexofs[s.charAt(i)] != indexoft[t.charAt(i)])  
10                return false; 
11            indexofs[s.charAt(i)] = i + 1; 
12            indexoft[t.charAt(i)] = i + 1;
13        }
14        return true;
15    }
16}
17