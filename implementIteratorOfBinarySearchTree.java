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
 * Example of iterate a tree:
 * Solution iterator = new Solution(root);
 * while (iterator.hasNext()) {
 *    TreeNode node = iterator.next();
 *    do something for node
 * } 
 */
public class Solution {
    Stack<TreeNode> stack = new Stack<>();
    TreeNode curr = null;
    //@param root: The root of binary tree.
    public Solution(TreeNode root) {
        if(root == null)return;
        while(root.left != null) {
            stack.push(root);
            root = root.left;
        }
        curr = root;
    }

    //@return: True if there has next node, or false
    public boolean hasNext() {
        // write your code here
        return curr != null;
    }
    
    //@return: return next node
    public TreeNode next() {
        // write your code here
        if(curr == null) return null;
        TreeNode result = curr;
        if(curr.right != null) {
            curr = curr.right;
            while(curr.left != null) {
                stack.push(curr);
                curr = curr.left;
            }
        }else if(!stack.isEmpty()) {
            curr = stack.pop();
        }else {
            curr = null;
        }
        return result;
    }
    
}
