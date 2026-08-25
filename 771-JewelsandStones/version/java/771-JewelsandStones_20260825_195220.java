// Last updated: 8/25/2026, 7:52:20 PM
1class Solution {
2    public int numJewelsInStones(String jewels, String stones) {
3        int c=0;
4        for(int i=0;i<jewels.length();i++){
5            for(int j=0;j<stones.length();j++){
6                if(jewels.charAt(i)==stones.charAt(j))
7                c++;
8            }
9        }
10        return c;
11    }
12}