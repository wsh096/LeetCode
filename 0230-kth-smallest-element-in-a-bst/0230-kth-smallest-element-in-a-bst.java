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
    private int number = 0;
    private int cnt = 0;
    public int kthSmallest(TreeNode root, int k) {
        cnt = k;
        helper(root);
        return number;
    }
    private void helper(TreeNode n){
        if(n.left != null) helper(n.left);
        cnt--;
        if(cnt == 0){
            number = n.val;
            return;
        }
        if(n.right != null) helper(n.right);
    }
}