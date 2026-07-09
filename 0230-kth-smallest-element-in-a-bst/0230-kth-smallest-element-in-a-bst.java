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
    int count=0;  
    int kth=0;
    public int kthSmallest(TreeNode root, int k) {
   
        
        inOrderTrav(root,k); 
        return kth;     
    }
    public void inOrderTrav(TreeNode root, int k){
        if(root==null) return;
        if(root.left!=null){
            inOrderTrav(root.left,k);
        }
        count++;
        if(count==k){
            kth=root.val;
            return;
        }
        if(root.right!=null){
            inOrderTrav(root.right,k);
        }
    }
}