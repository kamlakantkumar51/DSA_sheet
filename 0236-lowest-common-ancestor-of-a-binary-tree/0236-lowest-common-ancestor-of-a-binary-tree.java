class Solution {
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        if(root == null){
            return null;
        }
        if(root == p || root == q){
            return root;
        }
        TreeNode leftlca = lowestCommonAncestor(root.left,p,q);
        TreeNode rightlca = lowestCommonAncestor(root.right,p,q);
        if(leftlca!= null && rightlca!= null){
            return root;
        }
        if(leftlca!= null){
            return leftlca;
        }else{
            return rightlca;
        }
    }
}