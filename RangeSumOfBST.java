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
    public int rangeSumBST(TreeNode root, int L, int R) {
        TreeNode node = root ;
        
        int sum = 0;
       
        if(root == null) return sum;
        if(L < root.val)
		{
			sum+=rangeSumBST(root.left, L, R);
		}
		
		if(L <= root.val && R >= root.val)
		{
			sum+=root.val;
		}
		
		if(R > root.val)
		{
			sum+=rangeSumBST(root.right, L, R);
		}
        return sum;
    }
}
