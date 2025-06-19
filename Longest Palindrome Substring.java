import java.util.*;
class Solution {
    public String longestPalindrome(String s) {
        //brute force approach
        int n = s.length();
        String ans = "";
        for(int i=0;i<n;i++){
            for(int j=i;j<n;j++){
                String sub = s.substring(i,j+1);

                if(isPalindrome(sub)){
                    if(sub.length()>ans.length()){
                        ans = sub;
                    }
                }
            }
        }
        return ans;
    }
    private boolean isPalindrome(String str){
        int left = 0;
        int right = str.length()-1;
        while(left<right){
            if(str.charAt(left++)!= str.charAt(right--)){
                return false;
            }
        }
        return true;
    }
}
