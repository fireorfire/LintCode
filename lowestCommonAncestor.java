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
     * @param root: The root of the binary search tree.
     * @param A and B: two nodes in a Binary.
     * @return: Return the least common ancestor(LCA) of the two nodes.
     */
     TreeNode result, A, B;
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode A, TreeNode B) {
        // write your code here
        if(A == B) return A;
        this.A = A;
        this.B = B;
        existNode(root);
        return result;
    }
    public boolean existNode(TreeNode root) {
        if(root == null) return false;
        boolean lbool = existNode(root.left), rbool = existNode(root.right);
        if(lbool && rbool) {
            result = root;
            return true;
        }
        if(root != A && root != B) return lbool || rbool;
        if(rbool || lbool)
            result = root;
        return true;
    }
}
