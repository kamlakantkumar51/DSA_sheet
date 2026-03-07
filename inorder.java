class Solution {
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> ans = new ArrayList<>();
        inorder(root,ans);
        return ans;       
    }
    private void inorder(TreeNode root,List<Integer> ans){
        if(root == null){
            return;
        }
        //left
        inorder(root.left,ans);
        //root
        ans.add(root.val);
        //right
        inorder(root.right,ans);
    }
}
