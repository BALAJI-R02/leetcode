// Last updated: 9/10/2026, 2:09:20 PM
1/**
2 * Definition for a binary tree node.
3 * public class TreeNode {
4 *     int val;
5 *     TreeNode left;
6 *     TreeNode right;
7 *     TreeNode() {}
8 *     TreeNode(int val) { this.val = val; }
9 *     TreeNode(int val, TreeNode left, TreeNode right) {
10 *         this.val = val;
11 *         this.left = left;
12 *         this.right = right;
13 *     }
14 * }
15 */
16class Solution {
17    int ans = 0;
18    public int averageOfSubtree(TreeNode root) {
19        dfs(root);
20        return ans;
21    }
22    private int[] dfs(TreeNode node) {
23        if (node == null) 
24        return new int[]{0, 0};
25        int[] left = dfs(node.left);
26        int[] right = dfs(node.right);
27        int s = left[0] + right[0] + node.val;
28        int c = left[1] + right[1] + 1;
29        if (s / c == node.val) 
30        ans++;
31        return new int[]{s,c};
32    }
33}