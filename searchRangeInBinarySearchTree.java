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
     * @param k1 and k2: range k1 to k2.
     * @return: Return all keys that k1<=key<=k2 in ascending order.
     */
     private ArrayList<Integer> result = new ArrayList<>();
     private int k1, k2;
    public ArrayList<Integer> searchRange(TreeNode root, int k1, int k2) {
        // write your code here
        this.k1 = k1;
        this.k2 = k2;
        traverse(root);
        return result;
    }
    public void traverse(TreeNode root) {
        if(root == null) return;
        if(root.val < k1) {
            traverse(root.right);
        }else if(root.val > k2) {
            traverse(root.left);
        }else {
            traverse(root.left);
            result.add(root.val);
            traverse(root.right);
        }
    }
}
