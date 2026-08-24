// Last updated: 8/24/2026, 11:17:25 AM
1class Solution {
2    public String largestOddNumber(String num) {
3        for(int i=num.length()-1;i>=0;i--){
4            int a=num.charAt(i)-'0';
5            if(a%2!=0)
6            return num.substring(0,i+1);
7        }
8        return "";
9    }
10}