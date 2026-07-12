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
    int min=Integer.MAX_VALUE;
    int temp=Integer.MAX_VALUE;
    public int getMinimumDifference(TreeNode root) {
        postOrder(root);
        temp=root.val;
        return min;
    }
    public void postOrder(TreeNode root){
        if(root==null){
            return;
        }
        if(root.right!=null){
            postOrder(root.right);
        }
        
        min=Math.min(Math.abs(root.val-temp),min);
        temp=root.val;
        if(root.left!=null){
            postOrder(root.left);
        }

    }

}