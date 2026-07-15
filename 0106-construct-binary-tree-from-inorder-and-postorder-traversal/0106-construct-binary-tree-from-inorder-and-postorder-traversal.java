class Solution {
    int postIndex;
    HashMap<Integer,Integer> map = new HashMap<>();
    public TreeNode buildTree(int[] inorder, int[] postorder) {
        for(int i=0;i<inorder.length;i++){
            map.put(inorder[i],i);
        }
        postIndex = postorder.length - 1;
        return build(postorder,0,inorder.length-1);
    }

    private TreeNode build(int[] postorder,int start,int end){
        if(start > end){
            return null;
        }
        int rootVal = postorder[postIndex--];
        TreeNode root = new TreeNode(rootVal);
        int rootPos = map.get(rootVal);

        root.right = build(postorder,rootPos+1,end);
        root.left = build(postorder,start,rootPos-1);

        return root;
    }
}