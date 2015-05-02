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
     * @return: A list of lists of integer include 
     *          the zigzag level order traversal of its nodes' values 
     */
    public ArrayList<ArrayList<Integer>> zigzagLevelOrder(TreeNode root) {
        // write your code here
        ArrayList<ArrayList<Integer>> result = new ArrayList<>();
        Queue<TreeNode> queue = new LinkedList<TreeNode>();
        if(root == null) return result;
        queue.offer(root);
        boolean check = true;
        while(!queue.isEmpty()) {
            Queue<TreeNode> next = new LinkedList<TreeNode>();
            ArrayList<Integer> list = new ArrayList<>();
            for(TreeNode element: queue) {
                list.add(element.val);
                if(element.left != null)next.offer(element.left);
                if(element.right != null)next.offer(element.right);
            }
            queue = next;
            if(!check) Collections.reverse(list);
            result.add(list);
            check = !check;
        }
        return result;
    }
}
