import java.util.*;
class TreeNode{
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode(int val){
        this.val = val;
    }
}
class Solution {
    public List<TreeNode> generateTrees(int n) {
        if(n == 0 )return new ArrayList<>();
        return buildTrees(1,n);        
    }
    private List<TreeNode>buildTrees(int start,int end){
        List<TreeNode> trees = new ArrayList<>();
        if(start > end){
            trees.add(null);
            return trees;
        }
        for(int i=start;i<=end;i++){
            List<TreeNode>leftsubtree = buildTrees(start,i-1);
            List<TreeNode>rightsubtree = buildTrees(i+1,end);

            for(TreeNode left:leftsubtree){
                for(TreeNode right:rightsubtree){
                    TreeNode root = new TreeNode(i);
                    root.left = left;
                    root.right = right;
                    trees.add(root);

                }
            }
        }
        return trees;
    }

}