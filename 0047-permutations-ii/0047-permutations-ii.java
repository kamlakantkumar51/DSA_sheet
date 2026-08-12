import java.util.*;
class Solution {
    public List<List<Integer>> permuteUnique(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> arr = new ArrayList<>();
        
        for (int x : nums) {
            arr.add(x);
        }

        permuteRec(arr, 0, nums.length, ans);
        return ans;
    }

    private void permuteRec(List<Integer> arr, int l, int n, List<List<Integer>> ans) {
        if (l == n) {
            ans.add(new ArrayList<>(arr));
            return;
        }
        Set<Integer> visited = new HashSet<>();
        for (int i = l; i < n; i++) {
            if (visited.contains(arr.get(i))) {
                continue;
            }
            visited.add(arr.get(i));
            Collections.swap(arr, l, i);
            permuteRec(arr, l + 1, n, ans);
            Collections.swap(arr, l, i);
        }
    }
}