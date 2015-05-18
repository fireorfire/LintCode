/**
 * Definition of TreeNode:
 * public class TreeNode {
 *     public int val;
 *     public TreeNode left, right;
 *     public TreeNode(int val) {
 *         this.val = val;
 *         this.left = this.right = null;
 *     }
 * }
 */
public class Solution {
    /**
     * @param root: The root of binary tree.
     * @return: True if this Binary tree is Balanced, or false.
     */
     boolean check = true;
    public boolean isBalanced(TreeNode root) {
        // write your code here
        height(root);
        return check;
    }
    public int height(TreeNode root) {
        if(root == null) return 0;
        int l = height(root.left);
        int r = height(root.right);
        if(Math.abs(l - r) > 1) check = false;
        return Math.max(l, r) + 1;
    }
}
