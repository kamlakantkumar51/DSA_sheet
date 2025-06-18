// Input: strs = ["flower","flow","flight"]
// Output: "fl"
class Solution {
    public String longestCommonPrefix(String[] strs) {
        if(strs == null || strs.length == 0){
            return "";
        }
        //taking an string from an strs and then comparing to the other strings
        for(int i=0;i<strs[0].length();i++){
            char ch = strs[0].charAt(i);
            //working on other parts of strings
            for(int j = 1;j<strs.length;j++){
                if(i>= strs[0].length() ||strs[j].charAt(i)!= ch){
                    return strs[0].substring(0,i);
                }
            }
        }
        return strs[0];

    }
}
//vertical scanning approach
