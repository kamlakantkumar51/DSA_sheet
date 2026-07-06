class Solution {
    public boolean isSubtree(TreeNode root, TreeNode subRoot) {
        if(root == null){
            return false;
        }
        if(root.val == subRoot.val){
            if(isIdentical(root,subRoot)){
                return true;
            }
        }
        boolean leftans = isSubtree(root.left,subRoot);
        boolean rightans = isSubtree(root.right,subRoot);
        return leftans || rightans;
    }
    private static boolean isIdentical(TreeNode root,TreeNode subRoot){
        if(root == null && subRoot == null){
            return true;
        }else if(root == null || subRoot == null || root.val != subRoot.val){
            return false;
        }
        if(!isIdentical(root.left,subRoot.left)){
            return false;
        }
        if(!isIdentical(root.right,subRoot.right)){
            return false;
        }
        return true;
    }
}