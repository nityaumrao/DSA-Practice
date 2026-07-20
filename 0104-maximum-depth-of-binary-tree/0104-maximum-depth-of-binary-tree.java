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
    int max ;
    public int maxDepth(TreeNode root) {
        if(root == null) return 0;
        dfs(1 , root );
        return max ;
    }
    private void dfs(int depth , TreeNode node ){
        if(node.right == null && node.left == null){
            max = Math.max(max,depth);
            return ;
        }
        else{
           if(node.left != null){
                depth++ ;
                dfs(depth , node.left );
                depth--;
            }
            if(node.right != null){
                depth++;
                dfs(depth , node.right );
                depth--;
            }
        }
    }
}