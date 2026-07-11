class Solution {
    int count = 0;
    public int minCameraCover(TreeNode root) {
        if(mincam(root) == 2){
            count++;
        }
        return count;
    }
    private int mincam(TreeNode node){
        if(node == null){
            return 1;
        }
        int l = mincam(node.left);
        int r = mincam(node.right);

        if(l == 1 && r == 1){
            return 2;
        }else if(l == 2 || r == 2){
            count++;
            return 3;
        }
        return 1;
    }
}