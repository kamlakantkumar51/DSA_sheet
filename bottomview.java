//bfs
class Solution {
    class Pair{
        Node node;
        int hd;
        Pair(Node n,int h){
            node = n;
            hd = h;
        }
    }
    public ArrayList<Integer> bottomView(Node root) {
        // code here
        ArrayList<Integer> ans = new ArrayList<>();
        if(root == null)return ans;
        Map<Integer,Integer> map = new TreeMap<>();
        Queue<Pair> q = new LinkedList<>();
        q.add(new Pair(root,0));
        
        while(!q.isEmpty()){
            Pair curr = q.poll();
            map.put(curr.hd,curr.node.data);
            if(curr.node.left != null){
                q.add(new Pair(curr.node.left,curr.hd-1));
            }
            if(curr.node.right != null){
                q.add(new Pair(curr.node.right,curr.hd+1));
            }
        }
        for(int nums:map.values()){
            ans.add(nums);
        }
        return ans;  
    }
}
