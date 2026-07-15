class Solution {

    HashMap<Integer,Integer> map = new HashMap<>();
    public TreeNode constructFromPrePost(int[] preorder, int[] postorder) {
        for(int i=0;i<postorder.length;i++){
            map.put(postorder[i],i);
        }
        return build(preorder,0,preorder.length-1,
                     postorder,0,postorder.length-1);
    }
    private TreeNode build(int[] pre,int preStart,int preEnd,
                           int[] post,int postStart,int postEnd){

        if(preStart > preEnd){
            return null;
        }
        TreeNode root = new TreeNode(pre[preStart]);
        if(preStart == preEnd){
            return root;
        }
        int leftRoot = pre[preStart + 1];
        int idx = map.get(leftRoot);
        int leftSize = idx - postStart + 1;
        root.left = build(
            pre,
            preStart + 1,
            preStart + leftSize,
            post,
            postStart,
            idx
        );

        root.right = build(
            pre,
            preStart + leftSize + 1,
            preEnd,
            post,
            idx + 1,
            postEnd - 1
        );
        return root;
    }
}