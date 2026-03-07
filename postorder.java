class Solution {
    public List<Integer> postorderTraversal(TreeNode root) {
        List<Integer> ans = new ArrayList<>();
        postorder(root,ans);
        return ans;        
    }
    private void postorder(TreeNode root,List<Integer>ans){
        if(root == null){
            return;
        }
        //left
        postorder(root.left,ans);
        //right
        postorder(root.right,ans);
        //root
        ans.add(root.val);
    }
}
