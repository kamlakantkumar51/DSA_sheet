class Solution {
  public boolean isPalindrome(String s) {
    // Input: s = "A man, a plan, a canal: Panama"
    // Output: true
    int l = 0;
    int r = s.length() - 1;

    while (l < r) {
      while (l < r && !Character.isLetterOrDigit(s.charAt(l)))
        l++;
      while (l < r && !Character.isLetterOrDigit(s.charAt(r)))
        r--;
      if (Character.toLowerCase(s.charAt(l)) != Character.toLowerCase(s.charAt(r)))
        return false;
      l++;
      r--;
    }

    return true;
  }
}
