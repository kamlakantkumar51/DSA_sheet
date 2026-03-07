import java.util.*;
class Solution {
    int maxsum  = Integer.MIN_VALUE;
    public int maxPathSum(TreeNode root) {
        dfs(root);
        return maxsum;
    }
    private int dfs(TreeNode node){
        if(node == null){
            return 0;
        }
        int leftsum = Math.max(0,dfs(node.left));
        int rightsum = Math.max(0,dfs(node.right));
        int currsum = leftsum+ rightsum + node.val;
        maxsum = Math.max(currsum,maxsum);
        return node.val + Math.max(leftsum,rightsum);
    }
}
