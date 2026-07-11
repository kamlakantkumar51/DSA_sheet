class Solution {
    public List<List<Integer>> pathSum(TreeNode root, int targetSum) {
        List<List<Integer>>ans = new ArrayList<>();
        List<Integer> path = new ArrayList<>();
        print(root,targetSum,0,path,ans);
        return ans;
    }
    private  void print(TreeNode curr,int sum,int currsum,List<Integer> path,List<List<Integer>>ans){
        if(curr == null){
            return;
        }
        currsum += curr.val;
        path.add(curr.val);
        if (curr.left == null &&
            curr.right == null &&
            currsum == sum) {

            ans.add(new ArrayList<>(path));
        }
        print(curr.left,sum,currsum,path,ans);
        print(curr.right,sum,currsum,path,ans);
        path.remove(path.size()-1);
    }
}