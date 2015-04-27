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
     * @return: True if the binary tree is BST, or false
     */
    public boolean isValidBST(TreeNode root) {
        // write your code here
        return valid(null, null, root);
    }
    public boolean valid(TreeNode lBound, TreeNode rBound, TreeNode node) {
        if(node == null) return true;
        if((lBound == null || node.val > lBound.val) && (rBound == null || node.val < rBound.val)) {
            return valid(lBound, node, node.left) && valid(node, rBound, node.right);
        }
        return false;
    }
}
