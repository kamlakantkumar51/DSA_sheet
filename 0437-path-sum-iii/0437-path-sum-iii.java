class Solution {
    public int pathSum(TreeNode root, int targetSum) {
        if(root == null){
            return 0;
        }
        int ans = count(root,targetSum,0);
        ans += pathSum(root.left,targetSum);
        ans += pathSum(root.right,targetSum);
        return ans;
    }
    private int count(TreeNode node,int targetSum,long currsum){
        if(node == null){
            return 0;
        }
        int pathcount = 0;
        currsum += node.val;
        if(currsum == targetSum){
            pathcount++;
        }
        pathcount += count(node.left,targetSum,currsum);
        pathcount += count(node.right,targetSum,currsum);
        return pathcount;
    }
}