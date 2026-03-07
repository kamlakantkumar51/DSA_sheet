class Solution {
    public List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> ans = new ArrayList<>();
        preorder(root,ans);
        return ans;
    }
    private void preorder(TreeNode root,List<Integer>ans){
        if(root == null){
            return;
        }
        ans.add(root.val);
        //left traversal
        preorder(root.left,ans);
        //right traversal
        preorder(root.right,ans);
    }
}
