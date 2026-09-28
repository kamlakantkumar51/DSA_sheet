import java.util.*;
class Solution {
    public String minWindow(String s, String t) {
        if (s.length() < t.length()) return "";

        int[] targetFreq = new int[128];
        for (char c : t.toCharArray()) {
            targetFreq[c]++;
        }
        int[] windowFreq = new int[128];
        int left = 0, right = 0;
        int start = 0;
        int minLen = Integer.MAX_VALUE;
        int required = t.length();
        int formed = 0;
        while (right < s.length()) {
            char c = s.charAt(right);
            windowFreq[c]++;
            if (targetFreq[c] > 0 && windowFreq[c] <= targetFreq[c]) {
                formed++;
            }
            while (formed == required) {
                if (right - left + 1 < minLen) {
                    minLen = right - left + 1;
                    start = left;
                }
                char leftChar = s.charAt(left);
                windowFreq[leftChar]--;
                if (targetFreq[leftChar] > 0 && windowFreq[leftChar] < targetFreq[leftChar]) {
                    formed--;
                }
                left++;
            }

            right++;
        }

        return minLen == Integer.MAX_VALUE ? "" : s.substring(start, start + minLen);
    }
}
