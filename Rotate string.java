class Solution {
    public boolean rotateString(String s, String goal) {
        //bruteforce approach
        if(s.length() != goal.length()){
            return false;
        }
        for(int i=0;i<s.length();i++){
            s = s.substring(1) + s.charAt(0);
            if(s.equals(goal)){
                return true;
            }
        }
        return false;
    }
}
class Solution {
    public boolean rotateString(String s, String goal) {
        //optimised approach
        if(s.length()!= goal.length()){
            return false;
        }
        return (s+s).contains(goal);
    }
}
