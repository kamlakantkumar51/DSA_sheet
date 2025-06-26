//bruteforce approach
import java.util.ArrayList;
class Solution {
    ArrayList<Integer> search(String pat, String txt) {
        int m = pat.length();
        int n = txt.length();
        ArrayList<Integer> ans = new ArrayList<>();
        for (int i = 0; i <= n - m; i++) {   
            int j;
            for (j = 0; j < m; j++) {
                if (txt.charAt(i + j) != pat.charAt(j)) {
                    break;              
                }
            }
            if (j == m) {                   
                ans.add(i);                 
            }
        }
        return ans;
    }
}

//efficient approach
