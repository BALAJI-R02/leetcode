// Last updated: 10/15/2026, 9:08:16 AM
1class Solution {
2    public String makeGood(String s) {
3        Stack<Character> stack = new Stack<>();
4        
5        for (char c : s.toCharArray()) {
6            if (!stack.isEmpty() && Math.abs(c - stack.peek()) == 32) {
7                stack.pop();
8            } else {
9                stack.push(c);
10            }
11        }
12        
13        StringBuilder result = new StringBuilder();
14        while (!stack.isEmpty()) {
15            result.insert(0, stack.pop());
16        }
17        
18        return result.toString();
19    }
20}