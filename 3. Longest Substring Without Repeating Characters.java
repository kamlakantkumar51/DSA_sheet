// Input: s = "abcabcbb"
// Output: 3
// Explanation: The answer is "abc", with the length of 3.
import java.util.*;
class Solution {
    public int lengthOfLongestSubstring(String s) {
        //brute force approach
        int count = 0;
        for(int i=0;i<s.length();i++){
            StringBuilder ans = new StringBuilder();
            for(int j=i;j<s.length();j++){
                char ch = s.charAt(j);
                if(ans.toString().contains(String.valueOf(ch))){
                    break;
                }
                ans.append(ch);
                count = Math.max(count,ans.length());
            }
        }
        return count;
    }
}

import java.util.*;
class Solution {
    //slider window approach
    public int lengthOfLongestSubstring(String s) {
        Set<Character> ans = new HashSet<>();
        int i = 0;
        int maxcount = 0;

        for (int j = 0; j < s.length(); j++) {
            char ch = s.charAt(j);
            while (ans.contains(ch)) {
                ans.remove(s.charAt(i));
                i++;
            }

            ans.add(ch);
            maxcount = Math.max(maxcount, j - i + 1);
        }

        return maxcount;
    }
}


