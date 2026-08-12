import java.util.*;
class Solution {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        permutations(ans,nums,0);
        return ans;
    }
    private void permutations(List<List<Integer>> ans,int nums[],int idx){
        if(idx == nums.length){
            List<Integer> temp = new ArrayList<>();
            for(int val:nums)temp.add(val);
            ans.add(temp);
            return;
        }
        for(int i=idx;i<nums.length;i++){
            int temp = nums[idx];
            nums[idx] = nums[i];
            nums[i] = temp;

            permutations(ans,nums,idx+1);
            temp = nums[idx];
            nums[idx] = nums[i];
            nums[i] = temp;
        }
    }
}