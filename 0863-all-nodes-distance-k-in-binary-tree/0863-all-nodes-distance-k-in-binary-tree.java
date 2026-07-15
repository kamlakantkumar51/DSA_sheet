class Solution {
    HashMap<TreeNode,TreeNode> parent = new HashMap<>();
    public List<Integer> distanceK(TreeNode root, TreeNode target, int k) {
        buildParent(root,null);
        Queue<TreeNode> q = new LinkedList<>();
        HashSet<TreeNode> vis = new HashSet<>();
        q.offer(target);
        vis.add(target);
        int dist = 0;
        while(!q.isEmpty()){
            if(dist == k)break;
            int size = q.size();
            while(size-- >0){
                TreeNode curr = q.poll();
                //left child
                if(curr.left!= null && !vis.contains(curr.left)){
                    vis.add(curr.left);
                    q.offer(curr.left);
                }
                //right child
                if(curr.right != null && !vis.contains(curr.right)){
                    vis.add(curr.right);
                    q.offer(curr.right);
                }
                //parent
                TreeNode par = parent.get(curr);
                if(par!= null && !vis.contains(par)){
                    vis.add(par);
                    q.offer(par);
                }
            }
            dist++;
        }
        List<Integer> ans = new ArrayList<>();
        while(!q.isEmpty()){
            ans.add(q.poll().val);
        }
        return ans;
    }
    private void buildParent(TreeNode node,TreeNode par){
        if(node == null)return;
        parent.put(node,par);
        buildParent(node.left,node);
        buildParent(node.right,node);
    }
}