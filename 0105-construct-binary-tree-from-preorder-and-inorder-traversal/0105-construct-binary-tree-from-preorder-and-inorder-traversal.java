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
 import java.util.Map;
 import java.util.HashMap;
class Solution {
    int preIndex = 0;
    Map<Integer, Integer> inOrderIndexMap = new HashMap<>();
    public TreeNode buildTree(int[] preorder, int[] inorder){
        for(int i = 0; i < inorder.length; i++){
            inOrderIndexMap.put(inorder[i], i);
        }
        return build(preorder, inorder, 0, inorder.length - 1);
    }
    private TreeNode build(int[] preorder, int[] inorder, int inStart, int inEnd){
        if(inStart > inEnd) return null;

        TreeNode root = new TreeNode(preorder[preIndex++]);

        if(inStart == inEnd) return root;

        int inIndex = inOrderIndexMap.get(root.val);

        root.left = build(preorder, inorder, inStart, inIndex - 1);
        root.right = build(preorder, inorder, inIndex + 1, inEnd);

        return root;
    }
}