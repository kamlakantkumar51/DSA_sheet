//bruteforce approach
class Solution {
    public int countSubstrings(String s) {
        int n = s.length();
        int count = 0;
        for(int i=0;i<n;i++){
            for(int j=i;j<n;j++){
                String sub = s.substring(i,j+1);

                if(isPalindrome(sub)){
                    count++;
                }
            }
        }
        return count;
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
//class Solution {
    public int countSubstrings(String s) {
        //optimise approach
        int n = s.length();
        int count = 0;
        
        for(int centre = 0;centre<2*n-1;centre++){
            int left = centre/2;
            int right = left + (centre%2);

            while(left>=0 && right <n && s.charAt(left) == s.charAt(right)){
                count++;
                left--;
                right++;
            }
        }
        return count;
    }
}
