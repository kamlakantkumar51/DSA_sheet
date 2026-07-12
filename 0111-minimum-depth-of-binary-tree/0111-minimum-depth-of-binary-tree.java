class Solution {
    public int minDepth(TreeNode root) {
        if(root == null){
            return 0;
        }
        //left
        if(root.left == null){
            return 1+minDepth(root.right);
        }
        //right
        if(root.right == null){
            return 1+minDepth(root.left);
        }
        //left height
        int lh = minDepth(root.left);
        //right height
        int rh = minDepth(root.right);
        return Math.min(lh,rh)+1;
    }
}