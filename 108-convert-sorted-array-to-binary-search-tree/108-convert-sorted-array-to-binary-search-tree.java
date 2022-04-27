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
    public TreeNode sortedArrayToBST(int[] nums) {
        if(nums.length == 0) return null;
        return constructTree(nums,0,nums.length-1);
    }
    public TreeNode constructTree(int[] nums,int left, int right){
        if(left > right) return null;
        int midPoint = left+(right-left)/2;
        TreeNode node = new TreeNode(nums[midPoint]);
        
        node.left = constructTree(nums,left,midPoint-1);
        node.right = constructTree(nums,midPoint+1,right);
        
        return node;
    }
}