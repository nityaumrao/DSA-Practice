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
    public boolean isSameTree(TreeNode p, TreeNode q) {
        if(p == null && q==null) return true;
        if(p == null || q==null) return false;

        Queue<TreeNode> queueP = new ArrayDeque<>();
        Queue<TreeNode> queueQ = new ArrayDeque<>();

        queueP.add(p);
        queueQ.add(q);

        while(!queueP.isEmpty() && !queueQ.isEmpty()){

            if(queueP.peek().val != queueQ.peek().val )return false ;

            TreeNode pTemp = queueP.poll();
            TreeNode qTemp = queueQ.poll();

            if((pTemp.right != null && qTemp.right == null)||(pTemp.right == null && qTemp.right != null)){
                return false ;
            }
            if((pTemp.left == null && qTemp.left != null)||(pTemp.left != null && qTemp.left == null)){
                return false;
            }

            if(pTemp.right != null && qTemp.right != null){
                queueP.add(pTemp.right);
                queueQ.add(qTemp.right);
            }
            if(pTemp.left != null && qTemp.left != null){
                queueP.add(pTemp.left);
                queueQ.add(qTemp.left);
            }
        } 
        return true ;
    }
}