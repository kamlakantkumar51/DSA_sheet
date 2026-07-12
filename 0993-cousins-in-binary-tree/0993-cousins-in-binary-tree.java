class Solution {
    int depthX = -1;
    int depthY = -1;
    TreeNode parentX = null;
    TreeNode parentY = null;
    public boolean isCousins(TreeNode root, int x, int y) {
        dfs(root,null,0,x,y);
        return depthX == depthY && parentX!= parentY;
    }
    private void dfs(TreeNode node,TreeNode parent,int depth,int x,int y){
        if(node == null)return;
        if(node.val == x){
            depthX = depth;
            parentX = parent;
        }
        if(node.val == y){
            depthY = depth;
            parentY = parent;
        }
        dfs(node.left,node,depth+1,x,y);
        dfs(node.right,node,depth+1,x,y);
    }
}