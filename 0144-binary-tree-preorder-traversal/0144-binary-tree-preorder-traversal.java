class Solution {
    public List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> ans = new ArrayList<>();
        preorder(root,ans);
        return ans;        
    }
    private void preorder(TreeNode root,List<Integer> ans){
        if(root == null){
            return;
        }
        //root value
        ans.add(root.val);
        //left
        preorder(root.left,ans);
        //right
        preorder(root.right,ans);
    }
}