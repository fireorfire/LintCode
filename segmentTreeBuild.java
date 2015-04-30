/**
 * Definition of SegmentTreeNode:
 * public class SegmentTreeNode {
 *     public int start, end;
 *     public SegmentTreeNode left, right;
 *     public SegmentTreeNode(int start, int end) {
 *         this.start = start, this.end = end;
 *         this.left = this.right = null;
 *     }
 * }
 */
public class Solution {
    /**
     *@param start, end: Denote an segment / interval
     *@return: The root of Segment Tree
     */
    public SegmentTreeNode build(int start, int end) {
        // write your code here
        if(start > end) return null;
        SegmentTreeNode root = new SegmentTreeNode(start, end);
        grow(root);
        return root;
    }
    public void grow(SegmentTreeNode root) {
        if(root.start == root.end) return;
        int mid = (root.start + root.end)/2;
        SegmentTreeNode l = new SegmentTreeNode(root.start, mid), r = new SegmentTreeNode(mid + 1, root.end);
        root.left = l;
        root.right = r;
        grow(root.left);
        grow(root.right);
    }
}
