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
     *@param inorder : A list of integers that inorder traversal of a tree
     *@param postorder : A list of integers that postorder traversal of a tree
     *@return : Root of a tree
     */
     int[] post, in;
    public TreeNode buildTree(int[] inorder, int[] postorder) {
        // write your code here
        if(postorder.length == 0) return null;
        this.in = inorder;
        this.post = postorder;
        TreeNode root = new TreeNode(postorder[postorder.length - 1]);
        grow(root, 0, postorder.length - 2, 0, inorder.length - 1);
        return root;
    }
    public void grow(TreeNode root, int post1, int post2, int in1, int in2) {
        int rootVal = root.val;
        int inMid = in1;
        while(inMid < in2) {
            if(in[inMid] == rootVal) break;
            inMid++;
        }
        if(inMid != in1) {
            TreeNode lchild = new TreeNode(post[post2 - in2 + inMid]);
            root.left = lchild;
            grow(lchild, post1, post2 - in2 + inMid - 1, in1, inMid - 1);
        }
        if(inMid != in2) {
            TreeNode rchild = new TreeNode(post[post2]);
            root.right = rchild;
            grow(rchild, post2 + 1 - in2 + inMid, post2 - 1, inMid + 1, in2);
        }
    }
}
