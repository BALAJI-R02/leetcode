// Last updated: 5/16/2026, 5:49:27 PM
1class Solution {
2    public int[] dailyTemperatures(int[] temps) {
3        int[] results = new int[temps.length];
4        Stack<Integer> stack = new Stack<>();
5        for (int i = 0; i < temps.length; i++) {
6            while (!stack.isEmpty() && temps[stack.peek()] < temps[i]) {
7                results[stack.peek()] = i - stack.pop();
8            }
9            stack.push(i);
10        }
11        return results;
12    }
13}