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
    public int diameterOfBinaryTree(TreeNode root) {
        int[] diameter = new int[1];
        helper(root,diameter);
        return diameter[0];
    }
    public int helper(TreeNode root,int[] diameter){
        if(root==null){
            return 0;
        }
        int leftH = helper(root.left,diameter);
        int rightH = helper(root.right,diameter);
        diameter[0] = Math.max(diameter[0],leftH+rightH);
        return 1+Math.max(leftH,rightH);
    }
}
