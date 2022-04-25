/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public boolean isSymmetric(TreeNode root) {
        return is_sym(root,root);
    }
    public boolean is_sym(TreeNode nn,TreeNode mm)
    {
        if(nn == null && mm == null)
            return true;
        if(nn==null || mm==null||(nn.val != mm.val ))
            return false;
        
        
        boolean lf = is_sym(nn.left,mm.right);
        boolean rf = is_sym(nn.right,mm.left);
        return lf && rf;
        
    }
}
