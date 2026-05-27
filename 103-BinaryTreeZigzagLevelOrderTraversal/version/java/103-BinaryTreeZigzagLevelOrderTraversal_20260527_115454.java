// Last updated: 5/27/2026, 11:54:54 AM
1class Solution {
2    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
3        List<List<Integer>> ans = new ArrayList<>();
4
5        if (root == null) {
6            return ans;
7        }
8
9        Queue<TreeNode> q = new LinkedList<>();
10        q.add(root);
11
12        boolean ltor = true;
13
14        while (!q.isEmpty()) {
15
16            int size = q.size();
17            List<Integer> l = new ArrayList<>();
18
19            for (int i = 0; i < size; i++) {
20
21                TreeNode node = q.poll();
22
23                if (ltor) {
24                    l.add(node.val);
25                } else {
26                    l.add(0, node.val);
27                }
28
29                if (node.left != null) {
30                    q.add(node.left);
31                }
32
33                if (node.right != null) {
34                    q.add(node.right);
35                }
36            }
37
38            ans.add(l);
39            ltor = !ltor;
40        }
41
42        return ans;
43    }
44}