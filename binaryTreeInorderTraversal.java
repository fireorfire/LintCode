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
     * @return: Inorder in ArrayList which contains node values.
     */
     ArrayList<Integer> result = new ArrayList<>();
    public ArrayList<Integer> inorderTraversal(TreeNode root) {
        // write your code here
        post(root);
        return result;
    }
    public void post(TreeNode root) {
        if(root == null)return;
        post(root.left);
        result.add(root.val);
        post(root.right);
    }
}
