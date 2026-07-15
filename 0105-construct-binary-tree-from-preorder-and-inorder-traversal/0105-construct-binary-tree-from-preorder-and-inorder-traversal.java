class Solution {
    int preindex = 0;
    HashMap<Integer,Integer> map = new HashMap<>();
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        for(int i=0;i<inorder.length;i++){
            map.put(inorder[i],i);
        }
        return build(preorder,0,inorder.length-1);
    }
    private TreeNode build(int preorder[],int start,int end){
        if(start > end){
            return null;
        }
        int rootval = preorder[preindex++];
        TreeNode root = new TreeNode(rootval);
        int rootpos = map.get(rootval);

        root.left = build(preorder,start,rootpos-1);
        root.right = build(preorder,rootpos+1,end);

        return root;
    }
}