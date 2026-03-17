// Last updated: 3/17/2026, 11:40:40 AM
1class Solution {
2    public int longestValidParentheses(String s) {
3        Stack<Integer> str=new Stack<>();
4        int maxlen=0;
5        str.push(-1);
6        for(int i=0;i<s.length();i++){
7            char ch=s.charAt(i);
8            if(ch=='('){
9            str.push(i);
10            }
11            else{
12            str.pop();
13            if(str.isEmpty()){
14            str.push(i);
15            }
16            else{
17            maxlen=Math.max(maxlen,i-str.peek());
18            }
19            }
20        }
21        return maxlen;
22    }
23}