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
     *@param preorder : A list of integers that preorder traversal of a tree
     *@param inorder : A list of integers that inorder traversal of a tree
     *@return : Root of a tree
     */
     int[] pre, in;
     
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        // write your code here
        if(preorder.length == 0) return null;
        this.in = inorder;
        this.pre = preorder;
        TreeNode root = new TreeNode(preorder[0]);
        grow(root, 1, preorder.length - 1, 0, inorder.length - 1);
        return root;
    }
    public void grow(TreeNode root, int pre1, int pre2, int in1, int in2) {
        int rootVal = root.val;
        int inMid = in1;
        while(inMid < in2) {
            if(in[inMid] == rootVal) break;
            inMid++;
        }
        if(inMid != in1) {
            TreeNode lchild = new TreeNode(pre[pre1]);
            root.left = lchild;
            grow(lchild, pre1 + 1, inMid - in1 + pre1 - 1, in1, inMid - 1);
        }
        if(inMid != in2) {
            TreeNode rchild = new TreeNode(pre[inMid - in1 + pre1]);
            root.right = rchild;
            grow(rchild, inMid - in1 + pre1 + 1, pre2, inMid + 1, in2);
        }
    }
}
