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
     * @return: buttom-up level order a list of lists of integer
     */
    public ArrayList<ArrayList<Integer>> levelOrderButtom(TreeNode root) {
        // write your code here
        ArrayList<ArrayList<Integer>> result = new ArrayList<>();
        Queue<TreeNode> queue = new LinkedList<TreeNode>();
        if(root == null) return result;
        queue.offer(root);
        while(!queue.isEmpty()) {
            Queue<TreeNode> next = new LinkedList<TreeNode>();
            ArrayList<Integer> list = new ArrayList<>();
            for(TreeNode element: queue) {
                list.add(element.val);
                if(element.left != null)next.offer(element.left);
                if(element.right != null)next.offer(element.right);
            }
            queue = next;
            result.add(0, list);
        }
        return result;
    }
}
