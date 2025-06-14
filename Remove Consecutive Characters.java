class Solution {
    public String removeConsecutiveCharacter(String s) {
        if(s == null || s.length()<=1){
            return s;
        }
        StringBuilder result = new StringBuilder();
        result.append(s.charAt(0));
        
        for(int i=1;i<s.length();i++){
            char currCharac = s.charAt(i);
            char lastCharacinres = result.charAt(result.length()-1);
            
            if(currCharac != lastCharacinres ){
                result.append(currCharac);
            }
        }
        return result.toString();
    }
}
