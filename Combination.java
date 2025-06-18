// Input: n = 4, k = 2
// Output: [[1,2],[1,3],[1,4],[2,3],[2,4],[3,4]]
// Explanation: There are 4 choose 2 = 6 total combinations.
// Note that combinations are unordered, i.e., [1,2] and [2,1] are considered to be the same combination.
// Notice that the order of the output and the order of the triplets does not matter.
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
