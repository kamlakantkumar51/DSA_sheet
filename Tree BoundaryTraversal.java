/* Node Structure
class Node {
    int data;
    Node left, right;

    Node(int val) {
        data = val;
        left = right = null;
    }
} */

class Solution {
    public ArrayList<Integer> boundaryTraversal(Node root) {
        // code here
        ArrayList<Integer> ans = new ArrayList<>();
        if(root == null)return ans;
        if(!isLeaf(root)){
            ans.add(root.data);
        }
        //left boundary
        collectLeft(root.left,ans);
        //leaf nodes
        collectLeaf(root,ans);
        //right boundary
        collectRight(root.right,ans);
        return ans;
    }
    //left boundary
    private static void collectLeft(Node root,ArrayList<Integer> ans){
        if(root == null || isLeaf(root)) return;
        
        ans.add(root.data);
        if(root.left!= null){
            collectLeft(root.left,ans);
        }else if(root.right!= null){
            collectLeft(root.right,ans);
        }
    }
    //right boundary
    private static void collectRight(Node root,ArrayList<Integer> ans){
        if(root ==null || isLeaf(root))return;
        if(root.right!= null){
            collectRight(root.right,ans);
        }else if(root.left!= null){
            collectRight(root.left,ans);
        }
        ans.add(root.data);
    }
    //leaves boundary
    private static void collectLeaf(Node root,ArrayList<Integer> ans){
        if(root == null)return;
        if(isLeaf(root)){
            ans.add(root.data);
            return;
        }
        collectLeaf(root.left,ans);
        collectLeaf(root.right,ans);
        
    }
    private static boolean isLeaf(Node node){
        return node.left == null && node.right == null;
    }
    
    
}
