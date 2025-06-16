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
