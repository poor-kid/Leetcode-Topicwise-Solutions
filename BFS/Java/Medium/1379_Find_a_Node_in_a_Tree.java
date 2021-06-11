/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */

class Solution {
    public final TreeNode getTargetCopy(final TreeNode original, final TreeNode cloned, final TreeNode target) {
        if(original == target)
            return cloned;
        TreeNode res = null;
        Queue<TreeNode> queue = new LinkedList<TreeNode>();
        queue.offer(cloned);
        
        while(!queue.isEmpty())
        {
            int size = queue.size();
            TreeNode currNode = queue.poll();
            
            if(currNode.val == target.val)
                return currNode;
            if(currNode.left != null)
                queue.offer(currNode.left);
            if(currNode.right != null)
                queue.offer(currNode.right);
            
        }
        return res;
        
    }
}