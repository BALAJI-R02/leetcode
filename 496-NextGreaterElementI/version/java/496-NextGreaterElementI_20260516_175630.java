// Last updated: 5/16/2026, 5:56:30 PM
1class Solution {
2    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
3        int[] nextlarger = new int[10001];
4        Stack<Integer> stack = new Stack<>();
5        for (int i = nums2.length - 1; i >= 0; i--) {
6            while (!stack.isEmpty() && stack.peek() <= nums2[i]) 
7                stack.pop();
8            nextlarger[nums2[i]] = stack.isEmpty() ? -1 : stack.peek();
9            stack.push(nums2[i]);
10        }
11        for (int i = 0; i < nums1.length; i++) 
12            nums1[i] = nextlarger[nums1[i]];
13        return nums1;
14    }
15}