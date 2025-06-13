import java.util.*;
class Solution {
    public void combination(int index, int k, List<Integer> data, List<List<Integer>> result, int n) {
        // Base case: if size of current combination is k
        if (data.size() == k) {
            result.add(new ArrayList<>(data));
            return;
        }
        // Generating numbers from index to n
        for (int i = index; i <= n; i++) {
            data.add(i);  
            combination(i + 1, k, data, result, n); 
            data.remove(data.size() - 1); // backtrack
        }
    }

    public List<List<Integer>> combine(int n, int k) {
        List<List<Integer>> result = new ArrayList<>();
        List<Integer> data = new ArrayList<>();
        combination(1, k, data, result, n);
        return result;
    }
}
