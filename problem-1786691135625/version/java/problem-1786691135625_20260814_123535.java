// Last updated: 8/14/2026, 12:35:35 PM
1class Solution {
2    public String removeTrailingZeros(String num) {
3        int a=num.length()-1;
4        while(a>=0 && num.charAt(a)=='0')
5        a--;
6        return num.substring(0,a+1);
7    }
8}