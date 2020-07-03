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
    public int sumOfLeftLeaves(TreeNode root) {
        
        int leavesSum = 0 ;
        leavesSum = sumOfLeftLeafs(root);
        return leavesSum;
    }
    public  boolean isLeaf(TreeNode node)  
    { 
        if (node == null) 
            return false; 
        if (node.left == null && node.right == null) 
            return true; 
        return false; 
    } 
    
    public int sumOfLeftLeafs(TreeNode node){
        int res = 0;
        if (node != null)  
        { 
            // If left of root is NULL, then add key of 
            // left child 
            if (isLeaf(node.left)) 
                res += node.left.val; 
            else // Else recur for left child of root 
                res += sumOfLeftLeafs(node.left); 
   
            // Recur for right child of root and update res 
            res += sumOfLeftLeafs(node.right); 
        } 
        return res;
    }
}
