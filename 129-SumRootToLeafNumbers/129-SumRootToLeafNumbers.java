// Last updated: 2/11/2026, 2:01:16 PM
/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    int res=0;
    public void add(TreeNode root,String str){
        if(root==null) return;
        str+=root.val;
        if(root.left==null && root.right==null){
            res+=Integer.parseInt(str);
        }
        add(root.left,str);
        add(root.right,str);
    }
    public int sumNumbers(TreeNode root) {
        add(root,"");
        return res;
    }
}