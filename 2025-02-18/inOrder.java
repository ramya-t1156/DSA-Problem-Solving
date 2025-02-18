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
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> inOrder = new ArrayList<>();
        helper(root,inOrder);
        return inOrder;
    }
    public void helper(TreeNode root,List<Integer> inOrder){
        if(root==null){
            return;
        }
        helper(root.left,inOrder);
        inOrder.add(root.val);
        helper(root.right,inOrder);
    }
}
