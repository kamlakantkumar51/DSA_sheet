class Solution {
    public boolean isPalindrome(int x) {
        if(x < 0 )return false;
        x = Math.abs(x);
        String str = String.valueOf(x);
        return check(str,0,str.length()-1);
    }
    boolean check(String str,int start,int end){
        while(start >= end){
            return true;
        }
        if(str.charAt(start) != str.charAt(end)){
            return false;
        }
        return check(str,start+1,end-1);
    }
}