class Solution {
    private int matchingnode = 0;
    public int averageOfSubtree(TreeNode root) {
        postorder(root);
        return matchingnode;
    }
    private int[] postorder(TreeNode node){
        if(node == null){
            return new int[]{0,0};
        }
        int left[] = postorder(node.left);
        int right[] = postorder(node.right);

        int currsum = node.val + left[0]+right[0];
        int currcount = 1+left[1]+right[1];
        if(currsum / currcount == node.val){
            matchingnode++;
        }
        return new int[]{currsum,currcount};
    }
}