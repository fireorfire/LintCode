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
class Solution {
    /**
     * This method will be invoked first, you should design your own algorithm 
     * to serialize a binary tree which denote by a root node to a string which
     * can be easily deserialized by your own "deserialize" method later.
     */
    public String serialize(TreeNode root) {
        // write your code here
        if(root == null) return "";
        Queue<TreeNode> queue = new LinkedList<>();
        StringBuilder sb = new StringBuilder();
        queue.offer(root);
        while(!queue.isEmpty()) {
            TreeNode node = queue.poll();
            if(node == null) {
                sb.append(" #");
                continue;
            }
            sb.append(" " + Integer.toString(node.val));
            queue.offer(node.left);
            queue.offer(node.right);
        }
        return sb.toString();
    }
    
    /**
     * This method will be invoked second, the argument data is what exactly
     * you serialized at method "serialize", that means the data is not given by
     * system, it's given by your own serialize method. So the format of data is
     * designed by yourself, and deserialize it here as you serialize it in 
     * "serialize" method.
     */
    public TreeNode deserialize(String data) {
        // write your code here
        if(data.equals("")) return null;
        String[] node = data.split(" ");
        TreeNode root = new TreeNode(Integer.parseInt(node[1]));
        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);
        for(int i = 2; i < node.length; i+=2) {
            TreeNode par = queue.poll();
            if(!node[i].equals("#")) {
                TreeNode lchild = new TreeNode(Integer.parseInt(node[i]));
                par.left = lchild;
                queue.offer(lchild);
            }
            if(!node[i+1].equals("#")) {
                TreeNode rchild = new TreeNode(Integer.parseInt(node[i+1]));
                par.right = rchild;
                queue.offer(rchild);
            }
        }
        return root;
    }
}

