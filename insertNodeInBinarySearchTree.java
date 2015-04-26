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
     * @param node: insert this node into the binary search tree
     * @return: The root of the new binary search tree.
     */
    public TreeNode insertNode(TreeNode root, TreeNode node) {
        // write your code here
        if(node == null)return root;
        if(root == null)return node;
        TreeNode curr = root;
        while(true) {
            if(curr.val < node.val) {
                if(curr.right == null) {
                    curr.right = node;
                    break;
                }
                curr = curr.right;
            }else {
                if(curr.left == null) {
                    curr.left = node;
                    break;
                }
                curr = curr.left;
            }
        }
        return root;
    }
}
