class Solution {
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> ans = new ArrayList<>();
        level(root,0,ans);
        return ans;
    }
    private void level(TreeNode root,int level,List<List<Integer>> ans){
        if(root == null){
            return;
        }
        if(ans.size()<=level){
            ans.add(new ArrayList<>());
        }
        ans.get(level).add(root.val);
        level(root.left,level+1,ans);
        level(root.right,level+1,ans);
    }
}